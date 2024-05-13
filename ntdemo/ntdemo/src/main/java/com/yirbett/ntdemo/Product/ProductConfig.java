package com.yirbett.ntdemo.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public class ProductConfig {
    @Bean
    CommandLineRunner commandLineRunner(ProductRepository repo){
        return args->{
            Product nevera=   new Product("Nevera");
            Product plancha=  new Product("Plancha");
            repo.saveAll(List.of(nevera, plancha));
        };
    }
}
