import java.util.Scanner;

public class WordReverse {

    // creates boolean method
    static boolean isPalindromic(String word, String reversed) {
        if (word.equalsIgnoreCase(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Input word: ");
    String word = scan.nextLine();
    String reversed = "";

    // for loop to reverse the word input
    for (int i = 0; i < word.length(); i++) {
        reversed = word.charAt(i) + reversed;
    } 
    
    // if condition that returns the boolean method
    if (isPalindromic(word, reversed) == true) {
        System.out.println("True. The word is a PALINDROME");
    } else {
        System.out.println("False. The word is NOT a PALINDROME");
    } 

    scan.close();

    }
}
