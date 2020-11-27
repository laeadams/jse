package m2.s13.ex2;

public class Main {

	public static void main(String[] args) {

		SeaMovements[] seaVec = { new Boat(), new Amph() };
		LandVehicles[] landVec = { new Car(), new Amph() };

		for (SeaMovements aSeaVec : seaVec) {
			aSeaVec.turn(true);
		}
		for (LandVehicles aLandVec : landVec) {
			aLandVec.steer(true);
		}

	}

}
