import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Files {

	public static void main(String args[]) throws IOException { 
		// Assume a txt file has the ff: 10, 12, 15, 11, 86, 25
		// Create a program that allows the user to accept a number and determine whether the 
		// number is included in the text file. The program should display “found” if the number exists. 
		// Otherwise, display “not found”

		Scanner input = new Scanner(System.in); 
		System.out.println("Input number to find: "); 
		int find = input.nextInt();
		
		BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\JAVA CODES\\New folder (2)\\EXCEPTION\\letters.txt"));
		String content; // declares local variable
		
		ArrayList<String> FileContent = new ArrayList<String>();
		while((content = file.readLine()) != null) { // reads line
			FileContent.add(content); // adds all the file content to the ArrayList
		} 
		
		String num = Integer.toString(find); // converts input to String
		
		if (FileContent.contains(num)) { // displays FOUND when arraylist contains the input
			System.out.println("Found");
		} else {
			System.out.println("Not found"); // displays NOT FOUND and arraylist content when arraylist does not contain the input
		}
		
		file.close();
		input.close();
	}
}
