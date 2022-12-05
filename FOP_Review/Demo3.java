import java.util.Scanner;

public class Demo3 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in); 	
		// #3 LEAP YEAR OR NOT?
		System.out.println("Input year: ");
		int year = scan.nextInt();
		
		if(year%4==0 && !(year%100==0) || (year%400==0)) {
			System.out.println("The year " + year + " is a leap year.");
		} else {
			System.out.println("The year " + year + " is a regular year.");
		}
	}
}
