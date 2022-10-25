package ru.gb.spring;

import ru.gb.Product;

import java.text.DecimalFormat;
import java.util.Random;

public class ProductRepositoryNameService {

    private static long productSequence = 1L;

    public void InitName(Product product) {
        long sequence = productSequence++;
        Random random = new Random();
        DecimalFormat priceFormat = new DecimalFormat(".##");
        product.setId(sequence);
        product.setTitle("Товар №" + random.nextInt(99));
        product.setPrice(priceFormat.format(999.99 * random.nextDouble()) + " руб.");
    }

}
