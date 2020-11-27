package m2.s16.ex;

public class CountManager {
	
	private int ID;
	
	public CountManager(int ID) {
		this.ID = ID;
	}

	public int getID() {
		System.out.println(String.format("Account ID %d",ID));
		return ID;
	}



}
