//Linda's class
public class Main {

	public static void main(String[] args) {
		
		
		MenuItemMap menuMap = new MenuItemMap();
		
		MenuScanner s = new MenuScanner();
		menuMap = s.getMenuEntries();
		System.out.println(menuMap.listByName());
		System.out.println(menuMap.listByCategory());
		
		
	}

}
