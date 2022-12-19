import java.util.ArrayList;

import java.util.Scanner;

public class NameDeleter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // string arraylist of names
        ArrayList<String> YourName = new ArrayList<>();
		YourName.add("Richard");
	    YourName.add("Ashton");
	    YourName.add("Ashley");
	    YourName.add("Hailey");
	    YourName.add("Yurina");
	    YourName.add("Judith");


        // while loop that continues as arraylist size is greater than zero
        while (YourName.size()>0) {
           
            for (int i = 0; i < YourName.size(); i++) {
                System.out.print(YourName.get(i) + " "); // displays the remaining list of names
            }

            // gets the name to be deleted
            System.out.println("\nEnter a name to delete:");
            String word = scan.nextLine();

            // removes an element in the arraylist if matched with input 
            for (int j = 0; j < YourName.size(); j++) {
                if (word.equals(YourName.get(j))) {
                    YourName.remove(j);
                }
            }
        }

        // displays when array is empty
        System.out.println("Array is Empty");

        scan.close();
    }
}
