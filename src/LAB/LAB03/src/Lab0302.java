
import java.util.Scanner; //import scanner class
import java.util.ArrayList; // import the ArrayList class

public class Lab0302{
	
    public static void main(String[] args){
    	int StackSize ;
    	boolean Jong = true ;
    	String StackDirective ;
    	String PushData ;
    	String Topp = "Null" ;
    	int count = 0 ;
    	int countJong = 0;
    	String isEmpty = "isEmpty" ;  
    	String Push = "Push" ; 
    	String Pop = "Pop" ; 
    	String Top = "Top" ; 
    	String CheckStack = "CheckStack" ; 
    	
        //--------------------------------------------------------------------------------//
        Scanner mySC = new Scanner(System.in); //ประกาศการใช้ class scaner
        ArrayList<String> StackData = new ArrayList<String>();
        //--------------------------------------------------------------------------------//
        System.out.print("SetStackSize : ");
        StackSize = mySC.nextInt();
        System.out.print("SetStackSize(");
        System.out.println(StackSize+") ");
        
      //--------------------------------------Process-------------------------------------//
        while(Jong) {
        	countJong = 0 ; //รีเซตตัวนับ Comma
        	StackDirective = mySC.nextLine();
            
        	if(StackDirective.equals(isEmpty) == true ) {
        		if(count == 0) {
        		       System.out.println("---|Yes");
        		}else {
        		       System.out.println("---|No");
        		}
        	}//End if isEmptyDirective
        	
        	if(StackDirective.equals(Push) == true ) {
 		        System.out.print("Push : ");
 		        PushData = mySC.nextLine();
        		StackData.add(PushData);
        		Topp = PushData ;
        		count ++ ;
        	}//End if PushDirective
        	
        	if(StackDirective.equals(CheckStack) == true ) {
 		        System.out.print("---|Stack : ");
        	    for (String i : StackData ) {
        	        countJong ++ ;
        	        System.out.print(i);
        	        if(count > 1 && countJong < count) {
            	        System.out.print(", ");
        	        }

        	      }
 		        //System.out.print(" /---count = "+count+"---/");
 		        System.out.println("");
        	}//End if CheckStackDirective
        	
        	if(StackDirective.equals(Pop) == true ) {
 		        System.out.println("Pop : IsWork ");
        		StackData.remove(count-1);
        		count -- ;
        	}//End if PopDirective
        	
        	if(StackDirective.equals(Top) == true ) { 
        		System.out.print("--|");
        		System.out.println(Topp);
        	}//End if TopDirective
        	
        	if(StackDirective.equals("Break") == true ) {
        		System.out.println("End Program....");
        		Jong = false ;
        	}//End Condition Exit to Loop
        	
        }

    }
}