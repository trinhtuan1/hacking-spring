package com.greglturnquist.hackingspringboot.classic.config;

import com.greglturnquist.hackingspringboot.classic.entity.Item;
import com.greglturnquist.hackingspringboot.classic.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RepositoryDatabaseLoader {
    @Bean
    CommandLineRunner initialize(ItemRepository repository) {
        return args -> {
            repository.save(new Item("Alf alarm clock", 19.99));
            repository.save(new Item("Smurf TV tray", 24.99));
            repository.save(new Item("Tuan watch", 11.22));
        };
    }
}
