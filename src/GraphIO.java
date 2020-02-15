//@author Peder Holmqvist Sundén
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class GraphIO {
	
	static public void readFile(Graph g, String filename) throws IOException {
		try {
			
			
			int count = 0;
			
			File file =  new File(filename);
			Scanner s = new Scanner (file);
			String nodeAmount = s.nextLine();
			System.out.println(nodeAmount);
			//adds nodes by parsing the integers contained in the text file one by one, increasing the count up to a 100
			while(s.hasNextLine()) {
				if (count < Integer.parseInt(nodeAmount)) {
					g.addNode(Integer.parseInt(s.next()), Integer.parseInt(s.next()), Integer.parseInt(s.next()));
					count++;
			
				}
				
				// if the count is above 100 (or whatever is the first number in the text file, it adds edges from the text file following the same pattern as nodeamount
				else if (count >= Integer.parseInt(nodeAmount)){
					g.addEdge(Integer.parseInt(s.next()), Integer.parseInt(s.next()), Integer.parseInt(s.next()));
					
					
				}
			}
			
		
			s.close();
			
		} 
		// catches an exception where an element doesn't exist
		catch ( IOException e) {
			System.out.println(e);
			System.out.println("Couldn't find /read file");
		}
	}


		
	}
	
