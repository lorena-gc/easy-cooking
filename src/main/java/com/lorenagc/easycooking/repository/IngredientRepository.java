package com.lorenagc.easycooking.repository;

import com.lorenagc.easycooking.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository <Ingredient,String> {

    Ingredient findByName(String ingredient);

    Boolean existsByName(String name);
}
