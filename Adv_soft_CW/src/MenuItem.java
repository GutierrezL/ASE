/**
 * Advanced Software Engineering coursework
 * @author Linda Viksne
 */

/**
 *  A simple class to manage the details (name, price, category, whether is vegetarian)
 *  of the items on the menu.
 */
public class MenuItem {
	
	private String itemName;       
	private double itemPrice;
	private String category;
	private boolean isVegetarian;
	private static final String [] categories = new String[]{"Starter","Main", "Dessert", "Side", "Drink"};
	
	/**
	 * 
	 * @param name            Name of the menu item
	 * @param price           Price of the menu item
	 * @param category        Category of the menu item
	 * @param is_vegetarian   Whether the menu item is vegetarian (true) or not (false)
	 */
	public MenuItem(String name, double price, String category, boolean is_vegetarian){
		itemName = name;
		itemPrice = price;
		this.category = category;
		isVegetarian = is_vegetarian;
	}
	
	/*
	 * Returns the name of the item on the menu
	 */
	public String getName(){
		return itemName;
	}
	
	/*
	 * Returns the price of the item on the menu
	 */
	public double getPrice(){
		return itemPrice;
	}
	
	/*
	 * Returns the category of the item on the menu
	 */
	public String getCategory(){
		return category;
	}
	
	/*
	 * Sets a new name for the item on the menu
	 * @param new_name   the new name of the item on the menu
	 */
	public void setName(String new_name){
		itemName = new_name;
	}
	
	/*
	 * Sets a new price for the item on the menu
	 * @param new_price   the price of the item on the menu
	 */
	public void setPrice(String new_price){
		itemName = new_price;
	}
	
	/*
	 * Sets a new category for the item on the menu
	 * @param new_category   the category of the item on the menu
	 */
	public void setCategory(String new_category){
		category = new_category;
	}
}	
	
