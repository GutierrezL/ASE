
/**
 * Exception Class for No Matching Order ID
 */
public class NoMatchingOrderID extends Exception {
	public NoMatchingOrderID(String NoId){
		super("No ID Found = " + NoId);
	}
}
