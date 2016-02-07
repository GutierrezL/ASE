import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Advanced Software Engineering coursework
 * @author Linda Viksne
 */

/**
 * A class for storing the items on the menu.
 * @author Linda
 *
 */
public class MenuItemMap {
	
	private TreeMap<String, MenuItem> menuItemMap;
	
	private static final String [] categories = new String[]{"Starter","Main", "Dessert", "Side", "Drink"};
	
	public MenuItemMap(){
		menuItemMap = new TreeMap<String, MenuItem>();    
	}

	public void put(String name, MenuItem m) {
		// TODO Auto-generated method stub
		menuItemMap.put(name, m);
	}

	public String printMenu(){
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
	
	
	
	
}

