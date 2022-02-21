package com.lorenagc.easycooking.service;

import com.lorenagc.easycooking.model.Ingredient;
import com.lorenagc.easycooking.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IngredientService {

    @Autowired
    IngredientRepository ingredientRepository;

    public void addIngredient(Ingredient cadastro) {
        if(!ingredientRepository.existsByName(cadastro.getName()))
            ingredientRepository.save(cadastro);
    }

    public Optional<Ingredient> searchForIngredient(String name) {
        return Optional.ofNullable(ingredientRepository.findByName(name));
    }

}
