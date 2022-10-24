package ru.gb.spring;

import ru.gb.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private static final List<Product> list = new ArrayList<>();

    public Product getProduct(Integer id) {
        return list.stream().filter(product -> product.getId() == id).findAny().orElse(null);
    }

    public List<Product> getProduct() {
        return list;
    }

    public ProductRepository(final ProductRepositoryNameService productRepositoryNameSequence) {
        Product product = new Product();
        productRepositoryNameSequence.InitName(product);
        list.add(product);
    }
}
