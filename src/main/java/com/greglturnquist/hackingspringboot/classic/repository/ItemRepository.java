package com.greglturnquist.hackingspringboot.classic.repository;

import com.greglturnquist.hackingspringboot.classic.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}
