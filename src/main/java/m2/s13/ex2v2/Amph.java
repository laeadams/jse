package m2.s13.ex2v2;

public class Amph implements LandMoves, SeaMoves{
	
	@Override
	public void steer() {
		System.out.println("The amph is steering");
		
	}
	
	@Override
	public void turn() {
		System.out.println("The amph is turning");
		
	}

	@Override
	public void turnOn() {
		System.out.println("The amph is turning on the engine");
	}

}
