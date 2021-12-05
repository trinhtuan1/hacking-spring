package com.greglturnquist.hackingspringboot.classic.entity;

public class Dish {
    private String description;
    private boolean delivered = false;

    public Dish(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static Dish deliverDish(Dish dish) {
        Dish deliverDish = new Dish(dish.description);
        deliverDish.delivered = true;
        return deliverDish;
    }

    public boolean isDelivered() {
        return delivered;
    }
}
