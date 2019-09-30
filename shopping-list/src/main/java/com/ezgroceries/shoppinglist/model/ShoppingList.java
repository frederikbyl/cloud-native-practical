package com.ezgroceries.shoppinglist.model;

import java.util.List;
import java.util.UUID;


public class ShoppingList {
	
	private UUID shoppingListId;
	private String name;
	private List<String>ingredients;
	
	public ShoppingList() {
		super();
	}

	public ShoppingList(UUID shoppingListId, String name, List<String> ingredients) {
		super();
		this.shoppingListId = shoppingListId;
		this.name = name;
		this.ingredients = ingredients;
	}

	public ShoppingList(UUID shoppingListId, String name) {
		super();
		this.shoppingListId=shoppingListId;
		this.name = name;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	public UUID getShoppingListId() {
		return shoppingListId;
	}

	public void setShoppingListId(UUID shoppingListId) {
		this.shoppingListId = shoppingListId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
