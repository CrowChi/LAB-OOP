package Project;

public class main {
	public static void main (String[] args) {
		vehicle vehicle = new vehicle();
		vehicle.move();
		vehicle.move("Koravin");
		
		car car = new car();
		car.move(80, 40);
		
		supercar supercar = new supercar();
		supercar.move();
		
		motobike motobike = new motobike();
		motobike.move("honda", 120);
		
		ballon balloon = new ballon();
		balloon.move();
		
		drone drone = new drone();
		drone.move('a', 120);;
		
	}
}
