import java.util.Scanner;

public class Demo1 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in); 	
		
		// #1 SUM, AVE, PRODUCT
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double z = scan.nextDouble();
		double sum = x + y + z;
		double average = sum / 3;
		double product = x * y * z;
		System.out.println("Sum: " + sum + "\nAverage: " + average + "\nProduct: " + product);
    
	}
}
