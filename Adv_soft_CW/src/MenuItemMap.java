import java.util.Arrays;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Advanced Software Engineering coursework
 * @author Linda Viksne
 */

/**
 * A class for storing the items on the menu (MenuItem-s).
 */
public class MenuItemMap {
	
	private TreeMap<String, MenuItem> menuItemMap;
	//String array containing all the valid MenuItem categories
	private static final String [] categories = new String[]{"Starter","Main", "Side", "Dessert", "Drink"};
	
	public MenuItemMap(){
		menuItemMap = new TreeMap<String, MenuItem>();    
	}
	/**
	 * Returns the value (the MenuItem/null) corresponding to the provided key.
	 * @param item_name the String key provided.
	 * @return the value (MenuItem, if present in MenuItemMap, or null, if not) 
	 * corresponding to the key provided.
	 */
	public MenuItem findByName(String item_name){
		MenuItem item = menuItemMap.get(item_name);
		return item;
	}
	
	
	/**
	 * Adds a new MenuItem to the MenuItemMap.
	 * @param new_item the new MenuItem to be added.
	 */
	public void addItem(MenuItem new_item) {
		String category = new_item.getCategory();
		String name = new_item.getName();
		//Checks, if the category name is valid, i.e. if it is in the String array categories.
		boolean valid_category = Arrays.asList(categories).contains(category);
		if (findByName(name)!=null){
			String error = "Could not add '" + name + "'. Duplicate value.";
			System.out.println(error);
		} else if (!valid_category){
			//If the category, is not valid, the item is not added to the MenuItemMap
			//And an error message is shown
				String error = "Could not add " + name + ". '" + category + "' is not a valid menu item category.";
				System.out.println(error);
		} else {
			menuItemMap.put(name, new_item);
		}
	}
	

	/**
	 * Removes the MenuItem, identified by its name, from the MenuItemMap.
	 * @param item_name the name of the MenuItem.
	 */
	public void removeItem(String item_name){
		menuItemMap.remove(item_name);
	}
	
	/**
	 * Returns the total number of different MenuItem-s.
	 * @return an integer representing the total number of MenuItem-s in the MenuItemMap.
	 */
	public int getNumberOfDishes(){
		int num_of_dishes = menuItemMap.size();
		return num_of_dishes;
	}
	
	/**
	 * Returns a list of the MenuItem-s in alphabetical order.
	 * @return a string of the MenuItem-s in alphabetical order.
	 */
	public String listByName(){
		String menu = "";
		  // Get a set of the entries
	      Set set = menuItemMap.entrySet();
	      // Get an iterator
	      Iterator i = set.iterator();
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         MenuItem m = (MenuItem) me.getValue();
	         menu += "\r\n" + m.printItemSummary();
	      }
		return menu;
	}
	
	/**
	 * Returns a string showing all the MenuItem-s in the MenuItemMap grouped by category 
	 * in alphabetical order for each category.
	 * @return a String with all the MenuItem-s grouped by category.
	 */
	public String listByCategory(){
		String menu = "\r\nMENU \r\n==== \r\n";
		for (int i=0; i < categories.length; i++){
			String category = categories[i];
			menu += category.toUpperCase() + "\r\n";
			Set set = menuItemMap.entrySet();
		    // Get an iterator
		    Iterator iterator = set.iterator();
		    // Display elements
		    while(iterator.hasNext()) {
		       Map.Entry me = (Map.Entry)iterator.next();
		       MenuItem m = (MenuItem) me.getValue();
		       String categ = m.getCategory();
		       if (categ.equals(categories[i])){
		         menu += "    " + m.printItemSummary() + "\r\n";
		       }
		         }
		}	
		return menu;
	}
	
}

