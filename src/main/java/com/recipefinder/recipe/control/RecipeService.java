package com.recipefinder.recipe.control;

import com.recipefinder.recipe.entity.RecipeEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public List<RecipeEntity> getAllRecipes(){
        return recipeRepository.findAll();
    }

}
