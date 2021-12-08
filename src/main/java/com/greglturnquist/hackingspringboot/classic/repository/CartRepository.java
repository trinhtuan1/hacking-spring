package com.greglturnquist.hackingspringboot.classic.repository;

import com.greglturnquist.hackingspringboot.classic.entity.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, String> {
}
