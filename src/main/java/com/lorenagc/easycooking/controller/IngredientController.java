package com.lorenagc.easycooking.controller;

import com.lorenagc.easycooking.model.Ingredient;
import com.lorenagc.easycooking.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value= "/ingredient")
public class IngredientController {

    @Autowired
    IngredientService ingredientService;

    @RequestMapping(value= "/add", method = RequestMethod.POST)
    public void addIngredient (@RequestBody Ingredient cadastro){
        ingredientService.addIngredient(cadastro);
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public Optional<Ingredient> searchForIngredient(@RequestParam("ingredient") String ingredient){
        return ingredientService.searchForIngredient(ingredient);
    }
}
