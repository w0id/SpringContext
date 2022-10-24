package ru.gb;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gb.spring.Cart;
import ru.gb.spring.ProductRepository;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("ru.gb.config");

        ProductRepository productRepository = null;
        for (int i = 0; i < 5; i++) {
            productRepository = context.getBean(ProductRepository.class);
        }

        System.out.println("Список товаров");
        productRepository.getProduct().forEach(System.out::println);
        System.out.println("Поиск товара по ID");
        System.out.println(productRepository.getProduct(3));
        System.out.println("Создали корзину1");
        Cart cart1 = context.getBean(Cart.class);
        System.out.println("Добавили товар в корзину");
        cart1.addProduct(productRepository.getProduct(3));
        cart1.addProduct(productRepository.getProduct(5));
        cart1.getCart().forEach(System.out::println);
        System.out.println("Удалили товар из корзины");
        cart1.delProduct(productRepository.getProduct(3));
        cart1.getCart().forEach(System.out::println);
        System.out.println("Создали корзину2");
        Cart cart2 = context.getBean(Cart.class);
        System.out.println("Добавили товар в корзину");
        cart2.addProduct(productRepository.getProduct(1));
        cart2.addProduct(productRepository.getProduct(4));
        cart2.getCart().forEach(System.out::println);
        System.out.println("Удалили товар из корзины");
        cart2.delProduct(productRepository.getProduct(4));
        cart2.getCart().forEach(System.out::println);

    }
}