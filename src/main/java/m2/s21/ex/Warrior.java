package m2.s21.ex;

public class Warrior extends Actor{

	public Warrior(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean fight(Actor enemy) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		return "Warrior [name=" + super.getName() + "]";
	}

}
