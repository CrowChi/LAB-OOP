import java.util.Scanner;
 
public class Lab202 {
	
	// ตรวจสอบจำนวนเฉพาะ 
	public static void check_prime_nember(int num) {
	    boolean flag = true;
	    int count = 0;
	    int arr[] = new int[num];
	    //////////////////////////////////////////////////////
	    for (int i = 2; i <= num/2 ; ++i) {
	      if (num % i == 0) {
	        flag = false;
	        arr[count] = i;
	        count++;
	      }
	    }
	    //////////////////////////////////////////////////////
	    if (flag) {
	    	System.out.println(num + " = prime number");
	    }
	    else {
	    	System.out.print(num + " = not prime number: Divide by ");
	    	// หาว่ามีตัวไหนหารลงตัว
		    for(int i = 0; i <= count-1; i++) {
		    	if(arr[i] == 0) {
		    		break;
		    	}
		    	System.out.print(arr[i]);
		    	// ตรวจสอบตัวสึดท้าย
		    	if(i != count-1){
		    		System.out.print(",");
		    	}
		    }
		    
		    System.out.print("\n");
	    }   
	}// End check_prime_nember
	
	
	public static void lab2_2() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your value : ");
		int n = keyboard.nextInt();
		for(int i = 2; i <= n; i++) {
			check_prime_nember(i);
		}
	} // End lab2_2
	

	public static void main(String[] args) {
		lab2_2();
	}
}