package com.ezgroceries.shoppinglist.model;

import java.util.List;
import java.util.UUID;

public class CocktailResource {

	private UUID cocktailId;

	public CocktailResource() {
		super();
	}

	private String name;
	private String glass;
	private String instructions;
	private String image;
	private List<String> ingredients;

	public UUID getCocktailId() {
		return cocktailId;
	}

	public void setCocktailId(UUID cocktailId) {
		this.cocktailId = cocktailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGlass() {
		return glass;
	}

	public void setGlass(String glass) {
		this.glass = glass;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	public CocktailResource(UUID cocktailId, String name, String glass, String instructions, String image,
			List<String> ingredients) {
		this.cocktailId = cocktailId;
		this.name = name;
		this.glass = glass;
		this.instructions = instructions;
		this.image = image;
		this.ingredients = ingredients;
	}

	public CocktailResource(UUID cocktailId) {
		this.cocktailId = cocktailId;
	}

}
