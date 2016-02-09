import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MenuScanner {
	private MenuItemMap menuEntries;

    public MenuScanner()  {
    	//initialise empty Treemap of menu items
        menuEntries = new MenuItemMap();
        
        BufferedReader buff = null;
        String data [] = new String[4];
        try {
        	File file = new File("src/MenuInput.txt");
        	buff = new BufferedReader(new FileReader(file));
	    	String inputLine = buff.readLine();  //read first line
	    	int line_count=0;
	    	while(inputLine != null){  
	    		try {
	    			//split line into parts
	    			data  = inputLine.split(";");
	    			for (int i=0; i<4; i++){
	    				data[i] = data[i].trim();
	    				if (data[i] == null){
	    					System.out.println("Missing information on line " + ". Could not be added.");
	    				}
	    			}
	    		//create MenuItem object
	    		double price = Double.parseDouble(data[1]);
	    		boolean is_veg = Boolean.parseBoolean(data[3]);
	    		MenuItem m = new MenuItem(data[0], price, data[2], is_veg);
	    		//add to list
	            menuEntries.addItem(m);
	            //read next line
	            inputLine = buff.readLine();
	    		
	    		}catch (NumberFormatException nfe) {
	    			System.out.println("Error adding '" + data[0] + "'. Price '" +data[1]+ "' is not a number.");
	    			inputLine = buff.readLine();
	    		}
	    	}
        } catch(FileNotFoundException e) {
	         	System.out.println(e.getMessage());
	             System.exit(1);
	         }
	         catch (IOException e) {
	         	e.printStackTrace();
	             System.exit(1);        	
	         }
	    		
        finally  {
        	try{
        		buff.close();
        	}
        	catch (IOException ioe) {
        		//do not do anything
        	}
        }
        }
   
    public MenuItemMap getMenuEntries(){
    	return menuEntries;
    }
}

