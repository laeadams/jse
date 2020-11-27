package m2.s13.ex2;

public class Car extends LandVehicles {
	
	@Override
	public void steer(boolean right) {
		if (right) {
		System.out.println("The car is steering");
		}
	}
	
	

}
