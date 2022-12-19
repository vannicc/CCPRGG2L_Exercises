public class XmasTree {
 
	public static void main(String[] args) {
									
		
		System.out.println("Merry Christmas! Jerico and Wildelyn");			
										

		// Upper part of the Xmas Tree
		int a = 0;													
        while(a < 7){												
            int b = 0;												
            int c = 0;
            while(b < 7 - a){										
                System.out.print(" ");								
                b++;												
            }
            while(c < (2 * a) + 1){									
                System.out.print("*");
                c++;												
            }
            a++;													
            System.out.println("");
        }
        
        // Lower Part of the Xmas Tree
        int x = 1;												
        while(x <= 2){												
            int y = 6;												
            int z = 3;
  
            while(y > 0){											
                System.out.print(" ");
                y--;												
            }
            while(z > 0){										
                System.out.print("*");
                z--;											
            }
            x++;												
            System.out.println(" ");
	}
        
}
}
