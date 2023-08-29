import java.util.Arrays;
import java.util.Random;

public class MyCurrentArray extends MyClassicalArray {
	
	 static void Sort( int[] MyArray) {
		 
		 int i ;
		 int MaxNumber ;
		 	 
		 Arrays.sort(MyArray);
		 
		 System.out.print("Sort Array = ") ;
		 for(i=0; i<=10; i++) {
			 	System.out.print(MyArray[i]) ;
			    if(i<10) {
			    	System.out.print(",") ;
			    }
		 }
		 
		 System.out.println("") ;
		 
	}//END FindMax function
	 
//-----------------------------------------------------------------------------------------//	 
	 
	 static void Search( int[] MyArray, int Number ) {
		 
		 System.out.println("") ;
		 Arrays.sort(MyArray);
	 
		 System.out.print("Search position "+Number+" is "+ MyArray[Number]) ;
		 
	}//END FindMin function
	
//-----------------------------------------------------------------------------------------//	
	 

	public static void main(String[] args) {
		
		MyCurrentArray babyArray = new MyCurrentArray();
		int MyArray[] = new int[11] ;
		
		babyArray.RamdomNumber(MyArray);
		Sort(MyArray);
		babyArray.FindMax(MyArray);
		babyArray.FindMin(MyArray);
		Search(MyArray, 5);
		  	           
    }//END main function

}
