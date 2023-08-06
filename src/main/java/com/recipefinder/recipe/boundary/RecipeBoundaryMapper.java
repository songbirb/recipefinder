package com.recipefinder.recipe.boundary;

import com.recipefinder.recipe.entity.RecipeEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RecipeBoundaryMapper {

    public RecipeDto entityToDto(RecipeEntity entity) {
        return RecipeDto.builder()
                .name(entity.getName())
                .build();
    }

    public List<RecipeDto> entitiesToDtos(List<RecipeEntity> entities) {
        return entities.stream()
                .map(this::entityToDto)
                .toList();
    }
}
