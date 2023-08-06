package com.recipefinder.recipe.boundary;

import com.recipefinder.recipe.control.RecipeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/recipe/")
@AllArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;
    private final RecipeBoundaryMapper recipeBoundaryMapper;

    @GetMapping(value = "all")
    public List<RecipeDto> getAllRecipes() {
        return recipeBoundaryMapper.entitiesToDtos(recipeService.getAllRecipes());
    }

    @GetMapping("findRecipeBy/{searchText}")
    public List<RecipeDto> findBySearchText(@PathVariable String searchText) {
        return recipeBoundaryMapper.entitiesToDtos(recipeService.findBySearchText(searchText));
    }

}
