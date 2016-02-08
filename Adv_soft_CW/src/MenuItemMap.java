import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Advanced Software Engineering coursework
 * @author Linda Viksne
 */

/**
 * A class for storing the items on the menu.
 */
public class MenuItemMap {
	
	private TreeMap<String, MenuItem> menuItemMap;
	
	private static final String [] category_array = new String[]{"Starter","Main", "Dessert", "Side", "Drink"};
	public static final Set<String> categories = new HashSet<String>(Arrays.asList(category_array));
	
	public MenuItemMap(){
		menuItemMap = new TreeMap<String, MenuItem>();    
	}

	public MenuItem findByName(String item_name){
		MenuItem test2 = new MenuItem("Baked cheesecake", 4, "Dessert", true);
		return test2;
	}
	
	public void addItem(MenuItem new_item) {
		String category = new_item.getCategory();
		String name = new_item.getName();
		boolean valid_category = categories.contains(category);
		if (valid_category){
			menuItemMap.put(name, new_item);
		} else {
			String error = "Could not add " + name + ". '" + category + "' is not a valid dish category.";
			System.out.println(error);
		}
		
	
	}
	
	public void removeItem(String item_name){
		
	}

	public int getNumberOfDishes(){
		int num_of_dishes = 0;
		return num_of_dishes;
	}
	
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
	         System.out.println(m.printItemSummary());
	      }
		return menu;
	}
	

	public String listByCategory(){
		String menu = "";
		
		return menu;
	}
	

}

