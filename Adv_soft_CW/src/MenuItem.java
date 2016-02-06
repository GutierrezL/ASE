
public class MenuItem {
	
	private String itemName;
	private double itemPrice;
	private String category;
	private boolean isVegetarian;
	private static final String [] categories = new String[]{"Starter","Main", "Dessert", "Side", "Drink"};
	
	public MenuItem(String name, double price, String category, boolean is_vegetarian){
		
		itemName = name;
		itemPrice = price;
		this.category = category;
		isVegetarian = is_vegetarian;	
		
	}
}
