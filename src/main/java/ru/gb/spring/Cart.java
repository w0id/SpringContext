package ru.gb.spring;

import ru.gb.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<Product> cart = new ArrayList<>();

    public Cart() {
    }

    public void addProduct(final Product product) {
        this.cart.add(product);
    }

    public void delProduct(final Product product) {
        this.cart.remove(product);
    }

    public List<Product> getCart() {
        return cart;
    }
}
