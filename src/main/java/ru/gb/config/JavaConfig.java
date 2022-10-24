package ru.gb.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.gb.spring.Cart;
import ru.gb.spring.ProductRepository;
import ru.gb.spring.ProductRepositoryNameService;

@Configuration
public class JavaConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ProductRepository productRepository(ProductRepositoryNameService productRepositoryNameService) {
        return new ProductRepository(productRepositoryNameService);
    }

    @Bean
    public ProductRepositoryNameService productRepositoryNameService() {
        return new ProductRepositoryNameService();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Cart cart() {
        return new Cart();
    }
}
