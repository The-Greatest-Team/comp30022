package com.thegreatestteam.backend.repository;

import com.thegreatestteam.backend.model.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IngredientRepository extends MongoRepository<Ingredient,Integer> {

}