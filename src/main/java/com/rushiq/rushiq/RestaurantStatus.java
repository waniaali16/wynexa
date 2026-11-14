package com.rushiq.rushiq;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RestaurantStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int totalTables;
    private int occupiedTables;
    private int queueLength;
    private int kitchenOrders;

    public RestaurantStatus() {
    }

    public RestaurantStatus(int totalTables, int occupiedTables,
                            int queueLength, int kitchenOrders) {
        this.totalTables = totalTables;
        this.occupiedTables = occupiedTables;
        this.queueLength = queueLength;
        this.kitchenOrders = kitchenOrders;
    }

    public Long getId() {
        return id;
    }

    public int getTotalTables() {
        return totalTables;
    }

    public void setTotalTables(int totalTables) {
        this.totalTables = totalTables;
    }

    public int getOccupiedTables() {
        return occupiedTables;
    }

    public void setOccupiedTables(int occupiedTables) {
        this.occupiedTables = occupiedTables;
    }

    public int getQueueLength() {
        return queueLength;
    }

    public void setQueueLength(int queueLength) {
        this.queueLength = queueLength;
    }

    public int getKitchenOrders() {
        return kitchenOrders;
    }

    public void setKitchenOrders(int kitchenOrders) {
        this.kitchenOrders = kitchenOrders;
    }
}
