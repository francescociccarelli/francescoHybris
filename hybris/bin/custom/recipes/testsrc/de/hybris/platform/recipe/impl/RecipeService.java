/**
 *
 */
package de.hybris.platform.recipe;

import java.util.List;


public interface RecipeService
{

	List<RecipeModel> getRecipeByCode();

	List<RecipeModel> getRecipeByFoodId();

	List<RecipeModel> getRecipeByFoodServings();



}

