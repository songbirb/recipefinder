package com.recipefinder.recipe.control;

import com.recipefinder.recipe.entity.RecipeEntity;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<RecipeEntity,Integer> {
}
