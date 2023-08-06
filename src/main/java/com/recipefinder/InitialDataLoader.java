package com.recipefinder;

import com.recipefinder.recipe.control.RecipeRepository;
import com.recipefinder.recipe.entity.RecipeEntity;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
@AllArgsConstructor
public class InitialDataLoader implements ApplicationRunner {

    private final RecipeRepository recipeRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        recipeLoader();
    }

    void recipeLoader() {
        var recipe1 = RecipeEntity.builder().name("Recipe Name 1").build();
        var recipe2 = RecipeEntity.builder().name("Recipe Name 2").build();

        recipeRepository.save(recipe1);
        recipeRepository.save(recipe2);
    }
}
