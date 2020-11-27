package m2.s13.ex2;

public class Amph extends LandVehicles implements SeaMovements {
	
	@Override
	public void turn(boolean right) {
		if (right) {
		System.out.println("The amph is turning");
		}
	}
	
	@Override
	public void steer(boolean right) {
		
		if(right) {
		System.out.println("The amph is steering");
		}
	}
	
	

}
