package com.greglturnquist.hackingspringboot.classic.controller;

import com.greglturnquist.hackingspringboot.classic.entity.Item;
import com.greglturnquist.hackingspringboot.classic.repository.CartRepository;
import com.greglturnquist.hackingspringboot.classic.repository.ItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HomeController {
    private ItemRepository itemRepository;
    private CartRepository cartRepository;

    public HomeController(ItemRepository itemRepository, CartRepository cartRepository) {
        this.itemRepository = itemRepository;
        this.cartRepository = cartRepository;
    }

    @GetMapping("/list-items")
    Iterable<Item> listItems() {
        return itemRepository.findAll();
    }
}
