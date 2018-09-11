import java.io.*;
import java.util.*;

public class parse {

	    public static void main(String[] args) throws IOException {

	       // String fileName = "dataToParse.txt";
	        // This will reference one line at a time
	        String line = null;
	        File testFile = new File("File Path Name Goes Here");
	        File writeFile = new File("New File Path Name Goes Here");
			PrintStream writeToFile = new PrintStream(writeFile);
	        Scanner fileToWrite = new Scanner(writeFile);
	        //FileWriter fileWriter = new FileWriter(file);
	       //File testFile = new File(fileName);
	        	@SuppressWarnings("resource")
				Scanner fileReader = new Scanner(testFile);
	            while(fileReader.hasNextLine()) {
	            	line = fileReader.nextLine();
	                String[] lineArr = line.split("Character/s to split on go here");
	                for(int i = 0; i < lineArr.length; i++) {
	                	writeToFile.print(lineArr[i] + "\t");
	                }
	                writeToFile.println();
	                    
	               
	            }
	            
	            writeToFile.close();
	            fileToWrite.close();

}
	    
}
