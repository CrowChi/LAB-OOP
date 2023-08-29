package Project;

public class drone extends ballon {
	/**
	 * Start move drone 
	 */
	public drone() {
		System.out.println(" | drone start ! |");
	}//end method
	/**
	 * Just moving a drone 
	 * @param name user input a name and high
	 */
	public void move(char txt, int tmp) {
		System.out.println("Mr. " + txt + " ,farmer flies a drone at " + tmp +" above sea level. to survey the vegetable growing area");
	}//end method
}//end class

