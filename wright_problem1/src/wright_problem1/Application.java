package wright_problem1;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Application {
	public static void main(String [] args) throws IOException{
		String dataFile = "problem1.txt";
		String outputFile = "unique_words.txt";
		
		DuplicateRemover one = new DuplicateRemover();
		
		one.remove(dataFile);
		one.write(outputFile);
		
		
	}
}
