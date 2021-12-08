package com.greglturnquist.hackingspringboot.classic.entity;

import javax.persistence.*;

@Entity
public class CartItem {
    @Id @GeneratedValue
    private Integer id;
    private @ManyToOne(fetch = FetchType.LAZY) Cart cart;
    private @ManyToOne(fetch = FetchType.LAZY) Item item;
    private int quantity;

    public CartItem() {}

    public CartItem(Item item, Cart cart) {
        this.item = item;
        this.cart = cart;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
