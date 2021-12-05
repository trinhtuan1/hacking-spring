package com.greglturnquist.hackingspringboot.classic.controller;

import com.greglturnquist.hackingspringboot.classic.entity.Dish;
import com.greglturnquist.hackingspringboot.classic.service.KitchenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ServerController {
    private KitchenService kitchen;
    public ServerController(KitchenService kitchen) {
        this.kitchen = kitchen;
    }

    @GetMapping("/server")
    List<Dish> getDishes() {
        return kitchen.getDishes();
    }

    @GetMapping("/served-dishes")
    List<Dish> servedDishes() {
        return kitchen.getDishes().stream().map(item -> Dish.deliverDish(item)).collect(Collectors.toList());
    }
}
