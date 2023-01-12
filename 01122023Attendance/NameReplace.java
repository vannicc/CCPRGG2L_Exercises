import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Files {   
    public static void main(String args []) throws IOException {
    	// Assume a text contains the following string: Juwan, Limbo, Al Joseph, Laure
    	// Create a program that allow the user to replace a string found in the txt file. 
    	// The program should ask the user to enter a string to replace. 
    	// If the string is found, the user will be asked to enter a word for the replacement. 
    	// The word will overwrite the selected text. Allow the program to display the new set of string in the program. 
    	// If no string is found in the text, display invalid text.

        Scanner scan = new Scanner(System.in);
    	System.out.println("Input word: "); // inputs word to find
    	String input = scan.nextLine();
        
    	String filePath = "C:\\Users\\user\\Desktop\\JAVA CODES\\New folder (2)\\EXCEPTION\\Names.txt"; 
        String oldContent = "";
         
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
   
            // Reads all the lines of input text file into oldContent
           	String line;
            while ((line = reader.readLine()) != null) { // reads and stores file content to String "oldContent"
                oldContent += line + "\n";
            } 
            
            Pattern pattern = Pattern.compile(input, Pattern.LITERAL); // Defines the input to be used to search
            Matcher matcher = pattern.matcher(oldContent); // Searches the input to the String "oldContent"
            boolean contains = matcher.find(); // Used the find() method to return true when input was found in the text
            
            //Replaces input with newString in the oldContent
            if (contains) { // When input was found in the text, will ask the user to input a replacement. Then, rewrites all the updated string to file
            	System.out.println("New word: ");
            	String newWord = scan.nextLine(); // inputs word replacement
            	String newContent = oldContent.replaceAll(input, newWord); // replaces the input with the new word and stores it to String "newContent"
             
            		//Rewrites the input text file with newContent
            		FileWriter writer = new FileWriter(filePath); 
            		writer.write(newContent);
            		writer.close();
            		System.out.println("Updated content: \n" + newContent); // displays the rewritten content
         
            } else { // When input is not found in the text, displays invalid text and the content of the file
            	System.out.println("<Invalid text>");
            	System.out.println(oldContent);
            } 
      
        reader.close();
        scan.close();
    }  
}
