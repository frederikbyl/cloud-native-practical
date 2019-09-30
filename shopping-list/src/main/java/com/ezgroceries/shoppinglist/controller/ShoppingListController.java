package com.ezgroceries.shoppinglist.controller;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ezgroceries.shoppinglist.model.CocktailResource;
import com.ezgroceries.shoppinglist.model.ShoppingList;

@RestController
@RequestMapping(value = "/shopping-lists", produces = "application/json")
public class ShoppingListController {

	/**
	 * get all shopping lists
	 * @return
	 */
    @GetMapping
    public Resources<ShoppingList> getAll() {
        return new Resources<>(getAllDummyShoppingLists());
    }
    
    /**
     * Get shopping list with id
     * 
     * @param shoppingListId
     * @return
     */
	@GetMapping("{id}")
    public Resource<ShoppingList> get(@RequestParam UUID id) {
        return new Resource<>(getADummyShoppingList());
    }
    
	
	/**
	 * Create a shopping list
	 * generate uuid
	 * 
	 * @param shoppingList
	 * @return
	 */
    @PostMapping
    public Resource<ShoppingList> create(@RequestBody ShoppingList shoppingList) {
        return new Resource<>(getCreateShoppingListDummy());
    }   
    
    
    /**
     * Add cocktails to shoppinglist with id
     * 
     * @param shoppingListId
     * @param cocktails
     * @return
     */
    @PostMapping("/{id}/cocktails")
    public Resources<CocktailResource> addCocktails(@PathVariable UUID id, @RequestBody List<CocktailResource> cocktails) {
        return new Resources<>(getAddCocktailsDummy());
    }
    
    
    
    
    
    
    private List<CocktailResource> getAddCocktailsDummy() {
		// TODO Auto-generated method stub
		return Arrays.asList(new CocktailResource(UUID.fromString("23b3d85a-3928-41c0-a533-6538a71e17c4")));
	}

	private List<ShoppingList> getAllDummyShoppingLists() {
        return Arrays.asList(
                new ShoppingList(UUID.fromString("90689338-499a-4c49-af90-f1e73068ad4f"),"Stephanie's birthday"));
    }
    
    private ShoppingList getCreateShoppingListDummy() {
        return new ShoppingList(UUID.fromString("90689338-499a-4c49-af90-f1e73068ad4f"),"Stephanie's birthday");
    }
    
    private ShoppingList getADummyShoppingList() {
    	
    	return  new ShoppingList(UUID.fromString("90689338-499a-4c49-af90-f1e73068ad4f"),
    		    "Stephanie's birthday",
    		    Arrays.asList("Tequila", "Triple sec",
        		        "Lime juice",
        		        "Salt",
        		        "Blue Curacao"))
    		        ;	
    	
    }
}