
# Proyecto demostracion Serenity Java,Screenplay para tienda demoblaze


## Descripción

Este proyecto utiliza Serenity BDD con Java 17 y Maven para automatizar pruebas en la página [demoblaze.com](https://demoblaze.com/). El proyecto incluye los siguientes casos de uso:

- **Registro de un nuevo usuario** en la página Product Store.
- **Realización de una compra** añadiendo productos al carrito.

## Requisitos previos

- JDK 17
- Maven 3.6.3 o superior

## Configuración del entorno

Para ejecutar las pruebas, es necesario especificar el navegador que se desea utilizar. Esto se puede hacer mediante la propiedad `-Denvironment` en los comandos de Maven.

### Configuración del navegador

El entorno se puede configurar para ejecutar las pruebas en Chrome o Firefox.

- **Chrome**:
  ```sh
  mvn clean verify -Denvironment=chrome
  ```
- **Firefox**:
  ```sh
  mvn clean verify -Denvironment=firefox
  ```

## Estructura del proyecto

La estructura básica del proyecto es la siguiente:

```
├── test
│   ├── java
│   │   ├── demoblaze
│   │   │   ├── questions
│   │   │   ├── runners
│   │   │   ├── stepdefinitions
│   │   │   ├── task
│   │   │   ├── userinterfaces
├── resources
│   ├── features
│   ├── junit-platform.properties
│   ├── logback-test.xml
│   ├── serenity.conf
├── pom.xml
```
El cual contiene el patron screenplay usando cucumber
## Integracion continua

Este proyecto genera automaticamente los reportes mediante githubactions, el cual hacer cualquier cambio ejecuta los test 
en esta url
    
https://stormtrooper96.github.io/demoblazeJonathanandresPardo/

El action se encuentra alojado en esta url y puede ser ejecutado segun el navegador deseado

https://github.com/stormtrooper96/demoblazeJonathanandresPardo/actions/workflows/living-documentation.yml