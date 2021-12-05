package com.greglturnquist.hackingspringboot.classic.service;

import com.greglturnquist.hackingspringboot.classic.entity.Dish;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class KitchenService {
    private List<Dish> dishes;
    private Random picker = new Random();

    public KitchenService() {
        dishes = List.of(new Dish("Dish 1"), new Dish("Dish 2"), new Dish("Dish 3"));
    }

    public Dish randomDish() {
        return dishes.get(picker.nextInt(3));
    }

    public List<Dish> getDishes() {
        return Arrays.asList(randomDish(), randomDish());
    }
}
