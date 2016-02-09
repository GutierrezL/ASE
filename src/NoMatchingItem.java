
/**
 * Exception Class for No Matching Item
 */
public class NoMatchingItem extends Exception {
	public NoMatchingItem (String NoItem){
		super("No Item Found = " + NoItem);
	}
}
