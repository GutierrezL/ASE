
public class Main {

	public static void main(String[] args) {
		
		
		MenuItemMap menuMap = new MenuItemMap();
		
		//MenuItem test1 = new MenuItem("Roasted vegetables", 3.5, "Side", true);
		//MenuItem test2 = new MenuItem("Baked cheesecake", 4, "Dessert", true);
		//menuMap.put(test1.getName(), test1);
		//menuMap.put(test2.getName(), test2);
		//menuMap.printMenu();
		
		//System.out.println(test1.printItemSummary());
		//System.out.println(test2.printItemSummary());
		
		MenuScanner s = new MenuScanner();
		menuMap = s.getMenuEntries();
		menuMap.listByName();
		
		
	}

}
