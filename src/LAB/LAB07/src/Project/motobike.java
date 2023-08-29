package Project;

public class motobike extends vehicle {
	/**
	 * Start move motobike
	 */
	public motobike() {
		System.out.println(" | motobike start ! |");
	}//end method
	
	/**
	 * Just moving a motobike 
	 * @param move a motobike
	 */
	public void move(String brands , int km ) {
		System.out.println( "This " + brands + " motorcycle at speed on the roads "+ km   + " km/hr" );
	}//end method
}//end class