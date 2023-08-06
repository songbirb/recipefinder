package com.recipefinder.recipe.control;

import com.recipefinder.recipe.entity.RecipeEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipeRepository extends CrudRepository<RecipeEntity, Integer> {

    List<RecipeEntity> findAll();
    List<RecipeEntity> findRecipeEntitiesByNameIsContaining(String searchText);
}
