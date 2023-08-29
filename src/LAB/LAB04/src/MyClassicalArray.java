import java.util.Random; //Import RandomNumber
import java.util.Arrays;

public class MyClassicalArray {
	

	static void RamdomNumber(int MyArray[]){	
		int RandomNumber ;
		
    	Random rand = new Random(); //instance of random class
    	
    	System.out.print("RamdomNumber = ") ;
    	for(int i=0; i<=10; i++) {
    		RandomNumber = rand.nextInt(99); //เก็บค่าตัวเลขที่สุ่มมา
    		MyArray[i] = RandomNumber ;	
    		System.out.print(MyArray[i]+" ") ;
		    if(i<10) {
		    	System.out.print(",") ;
		    }
    	}
    	System.out.println("") ;
    	
	}
	
	
	 static void FindMax( int[] MyArray) {
		 int i ;
		 int MaxNumber ;
		 
		 Arrays.sort(MyArray);
		 MaxNumber = MyArray[10] ;
		 
		 System.out.print("MaxNumber = " + MaxNumber) ;
		 
	}//END FindMax function
	 
//-----------------------------------------------------------------------------------------//	 
	 
	 static void FindMin( int[] MyArray ) {
		 int i ;
		 int MinNumber ;
		 
		 System.out.println("") ;
		 Arrays.sort(MyArray);
		 MinNumber = MyArray[0] ;
		 
		 System.out.print("MinNumber = " + MinNumber) ;
	}//END FindMin function
	
//-----------------------------------------------------------------------------------------//	
	 

	public static void main(String[] args) {
		//---------------------------สุ่มค่า Array----------------------//
		int MyArray[] = new int[11] ;
		RamdomNumber(MyArray);
		//---------------------------จบสุ่มค่า Array----------------------//
    		
    	FindMax(MyArray);
    	FindMin(MyArray);
    	           
    }//END main function

}




