package com.rushiq.rushiq;

import org.springframework.stereotype.Service;

@Service
public class RushService {

    private final RestaurantStatusRepository repository;

    public RushService(RestaurantStatusRepository repository) {
        this.repository = repository;
    }

    private RestaurantStatus getStatus() {
        return repository.findAll()
                .stream()
                .findFirst()
                .orElseThrow(() ->
                        new IllegalStateException("Restaurant status not found"));
    }

    public int getCapacityPercentage() {
        RestaurantStatus status = getStatus();

        if (status.getTotalTables() == 0) {
            return 0;
        }

        return (status.getOccupiedTables() * 100)
                / status.getTotalTables();
    }

    public String getRushLevel() {
        RestaurantStatus status = getStatus();
        int capacity = getCapacityPercentage();

        if (capacity >= 80 || status.getQueueLength() >= 6) {
            return "Very Busy";
        } else if (capacity >= 60 || status.getQueueLength() >= 3) {
            return "Moderate";
        } else {
            return "Quiet";
        }
    }

    public int calculateWaitTime(int partySize) {
        RestaurantStatus status = getStatus();

        int wait = status.getQueueLength() * 3;

        if (getCapacityPercentage() >= 80) {
            wait += 8;
        }

        if (partySize >= 5) {
            wait += 7;
        } else if (partySize >= 3) {
            wait += 4;
        }

        if (status.getKitchenOrders() >= 10) {
            wait += 5;
        }

        return wait;
    }

    public int getQueueLength() {
        return getStatus().getQueueLength();
    }

    public int getKitchenOrders() {
        return getStatus().getKitchenOrders();
    }

    public int getTotalTables() {
        return getStatus().getTotalTables();
    }

    public int getOccupiedTables() {
        return getStatus().getOccupiedTables();
    }

    public int getFreeTables() {
        RestaurantStatus status = getStatus();
        return status.getTotalTables() - status.getOccupiedTables();
    }
}