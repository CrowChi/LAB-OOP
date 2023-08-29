import java.util.Scanner;  // Import the Scanner class


public class Lab201 {
    public static void main(String[] args) {
    	int Number ;
    	
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Please enter your value : ");
        
        Number = myObj.nextInt();  // Read user input
        System.out.println("-----------------------");


    	for(int i=1; i<=Number; i++ ) {
    		System.out.print(i);
    		
    		if(i%5==0) {
    			System.out.println("");
    		}else {
    			System.out.print(" ,");
    		}
    		
    	}
    	        
    }
}
