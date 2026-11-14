package com.rushiq.rushiq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final RestaurantStatusRepository repository;

    public DataInitializer(RestaurantStatusRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        if (repository.count() == 0) {
            RestaurantStatus status =
                    new RestaurantStatus(20, 16, 5, 12);

            repository.save(status);

            System.out.println("Wynexa restaurant data saved to MySQL.");
        }
    }
}