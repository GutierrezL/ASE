
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuItem test1 = new MenuItem("Roasted vegetables", 3.5, "Side", true);
		MenuItem test2 = new MenuItem("Baked cheesecake", 4, "Dessert", true);
		System.out.println(test1.printItemSummary());
		System.out.println(test2.printItemSummary());
	}

}
