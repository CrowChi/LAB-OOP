import java.util.Scanner;  // Import the Scanner class
import java.util.Random; //Import RandomNumber
import java.util.ArrayList; // import the ArrayList class

public class Lab0301 {
	
    public static void main(String[] args) {
    	int MaxNumber ;
    	int RandomNumber ;
    	int count = 0 ;
    	
   //---------------------class Import-----------------------------------------//   
      
        Random rand = new Random(); //instance of random class
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();//สร้างตัวแปรเก็บค่า ArrayList
   //---------------------End class Import-----------------------------------------//  
        
        System.out.print("Please enter your random value : ");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        MaxNumber = myObj.nextInt();  // เก็บค่าสูงสุดที่ผู้ใช้กรอกมา


          
        RandomNumber = rand.nextInt(MaxNumber); //เก็บค่าตัวเลขที่สุ่มมา
        System.out.println("-----------------------");
        
        if(MaxNumber > 0 && MaxNumber < 100) {
            for(int i=0; i <= MaxNumber; i++) {
                RandomNumber = rand.nextInt(MaxNumber); //เก็บค่าตัวเลขที่สุ่มมา
                myNumbers.add(RandomNumber);  
            }// End forLoop
            
            for(int j: myNumbers ) {
                System.out.println("Array["+count+"]"+" = " + j);
                count++ ;
            }// End forLoop
        }else {
        	System.out.println("Please Enter Number 0-99");
        }//End if
                      
    }//END Void main
    
}



