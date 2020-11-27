package m2.s13.ex2v2;

public class Car implements LandMoves{
	
	@Override
	public void steer() {
		System.out.println("The car is steering");
		
	}

	@Override
	public void turnOn() {
		System.out.println("Car is turning on the engine");
	}

}
