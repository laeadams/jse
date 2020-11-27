package m2.s16.ex;

public class Count extends CountManager implements Operations{
	private double money;
	
	// CTOR
	public Count(int ID, double money) {
		super(ID);
		this.money = money;
	}

	public double getMoney() {
		System.out.println(String.format("Deposit available = %.1f €",money));
		return money;
	}
	
	private void setMoney(double money) {
		this.money = money; 
	}
	
	@Override
	public double deposit(double dep) {
		setMoney(money + dep);
		return money + dep;
	}

	@Override
	public double withdrawal(double wit) {
		if (wit<=this.money) {
			setMoney(money-wit);
			return this.money-wit;
		} else {
			System.out.println("Withdrawal denied. Not enough fund.");
			return this.money;
		}
		
	}
	

}
