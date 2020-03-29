package wright_problem1;
import java.util.*;
import java.io.*;

public class DuplicateRemover {
	HashSet<String> uniqueNames = new HashSet<String>();
    ArrayList<String> stringSet = new ArrayList<String>();
	
	public void remove(String dataFile) throws IOException {
		Scanner input = new Scanner(new File(dataFile));
        while (input.hasNextLine()) {

            // Makes every line an array of Strings
        	
            String[] words = input.nextLine().split(" ");
            String edited = "";
            for (int i = 0; i < words.length; i++) {

                // Checks
                if (uniqueNames.add(words[i])) {
                    edited += words[i] + " ";
                }
            }

            // Final line handling
            if (!edited.equals("")) {
                stringSet.add(edited);
            }
            
            String outputFn = "problem1.txt";
    		
            BufferedWriter output = new BufferedWriter(new FileWriter(outputFn));
            
            // Writes file
            output.write(String.join("\n", stringSet));
            
            //Closes file
            output.close();
        }
	}
	
	public void write(String outputFile) throws IOException  {
		String outputFn = "unique_words.txt";
		
        BufferedWriter output = new BufferedWriter(new FileWriter(outputFn));
        
        // Writes file
        output.write(String.join("\n", uniqueNames));
        
        //Closes file
        output.close();
		
	}
}
