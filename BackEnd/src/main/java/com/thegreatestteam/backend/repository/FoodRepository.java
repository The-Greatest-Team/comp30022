package com.thegreatestteam.backend.repository;

import com.thegreatestteam.backend.model.Food;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodRepository extends MongoRepository<Food,Integer> {
}