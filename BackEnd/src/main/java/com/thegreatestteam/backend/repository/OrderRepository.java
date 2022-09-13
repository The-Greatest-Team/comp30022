package com.thegreatestteam.backend.repository;

import com.thegreatestteam.backend.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order,Integer> {
    List<Order> findOrdersByTableNumber(Integer tablenumber);
    List<Order> findOrdersByPhoneNumer(String phoneNumber);
}
