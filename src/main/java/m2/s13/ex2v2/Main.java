package m2.s13.ex2v2;

public class Main {

	public static void main(String[] args) {

		
		LandMoves[] landVec = { new Car(), new Amph() };
		SeaMoves[] seaVec = { new Boat(), new Amph() };

		for (LandMoves aLandVec : landVec) {
			aLandVec.turnOn();
			aLandVec.steer();
		}
		for (SeaMoves aSeaVec : seaVec) {
			aSeaVec.turnOn(); 
			aSeaVec.turn();
		}

	}

}
