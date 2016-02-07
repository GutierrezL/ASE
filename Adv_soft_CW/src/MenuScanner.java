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
        	//for(String fileNames : file.list()) System.out.println(fileNames);
        	buff = new BufferedReader(new FileReader(file));
	    	String inputLine = buff.readLine();  //read first line
	    	while(inputLine != null){  
	    		
	    		//split line into parts
	    		data  = inputLine.split(";");
	    		for (int i=0; i<4; i++){
	    			data[i] = data[i].trim();
	    		}
	    		
	    		//create MenuItem object
	    		double price = Double.parseDouble(data[1]);
	    		boolean is_veg = Boolean.parseBoolean(data[3]);
	    		MenuItem m = new MenuItem(data[0], price, data[2], is_veg);
	    		//add to list
	            menuEntries.put(m.getName(), m);
	            //read next line
	            inputLine = buff.readLine();
	            
	        }
        }
        catch(FileNotFoundException e) {
        	System.out.println(e.getMessage());
            System.exit(1);
        }
        catch (IOException e) {
        	e.printStackTrace();
            System.exit(1);        	
        }
        catch (NumberFormatException nfe) {
        	System.out.println(data[0] + ": Price is not a number :" + data[1]);
        	System.out.println("Program terminated");
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

