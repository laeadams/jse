package m2.s13.ex2;

public class Boat implements SeaMovements{
	
	@Override
	public void turn(boolean right) {
		if (right) {
		System.out.println("The boat is turning");
		}
		
	}

}
