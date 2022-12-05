import java.util.Scanner;

public class Demo2 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in); 	
    
		// #2 DISTANCE FORMULA
    // late work so zero points :((
    
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double power1 = Math.pow((x2 - x1), 2);
		double power2 = Math.pow((y2 - y1), 2);
		
		System.out.printf("The distance between points is: " + "%.4f", Math.sqrt(power1 + power2));
	}
}
