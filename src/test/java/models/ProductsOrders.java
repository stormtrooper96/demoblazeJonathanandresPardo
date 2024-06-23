package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProductsOrders {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addAllProducts(Collection<Product> books) {
        this.products.addAll(books);
    }


}
