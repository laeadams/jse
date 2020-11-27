package m2.s16.ex;

public class Bank implements Operations{
	
	private double fund = 1E4;
	
	public double getFund() {
		System.out.println(String.format("Bank fund = %.1f €",fund));
		return fund;
	}
//	private void setFund(double fund) {
//		this.fund = fund; 
//	}
	
	@Override
	public double deposit(double dep) {
		double tax = 0.3; // 30% taxes on every deposit
		this.fund +=  dep*(1-tax);
		return this.fund;
//		setFund(fund+dep*(1-tax));
//		return fund+dep*(1-tax); // bank has to pay taxes for every deposit
	}

	
//	@Override
//	public double deposit(double dep) {
//		setMoney(money + dep);
//		return money + dep;
//	}

	@Override
	public double withdrawal(double wit) {
		this.fund -= wit;
		return this.fund;
//		setFund(fund-wit);
//		return fund-wit;
	}

}
