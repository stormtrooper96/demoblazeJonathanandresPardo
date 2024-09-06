import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.rest.SerenityRest;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJsonResponse implements Question<Boolean> {

    private final String expectedKey;
    private final String expectedProperty;

    public ValidateJsonResponse(String expectedKey, String expectedProperty) {
        this.expectedKey = expectedKey;
        this.expectedProperty = expectedProperty;
    }

    // Método que valida el JSON
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            // Obtener la última respuesta como String
            String responseBody = SerenityRest.lastResponse().getBody().asString();

            // Convertir la respuesta a un JsonNode
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(responseBody);

            // Recorrer y validar si existe la clave y propiedad en el JSON
            JsonNode elementosArray = rootNode.get("elementos");

            if (elementosArray.isArray()) {
                for (JsonNode elemento : elementosArray) {
                    if (elemento.has(expectedKey) && elemento.has(expectedProperty)) {
                        return true; // Se encontró la clave y propiedad
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; // Si no se encuentra la clave o la propiedad
    }

    // Método estático para simplificar el uso en el guion
    public static ValidateJsonResponse containsKeyAndProperty(String key, String property) {
        return new ValidateJsonResponse(key, property);
    }
}
