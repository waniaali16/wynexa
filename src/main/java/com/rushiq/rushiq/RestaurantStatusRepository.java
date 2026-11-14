package com.rushiq.rushiq;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantStatusRepository
        extends JpaRepository<RestaurantStatus, Long> {
}