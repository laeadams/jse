package m2.s13.ex2v2;

public class Boat implements SeaMoves, EngineCommand{
	
	@Override
	public void turn() {
		System.out.println("The boat is turning");
		
	}

	@Override
	public void turnOn() {
		System.out.println("The boat is turning on the engine");	
	}

}
