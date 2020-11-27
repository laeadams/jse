package m2.s16.ex;

public class Main {
	
	public static void main(String[] args) {
		
		// create the count: ID 1, money 1000 €
		// BANK ACCESS
		Bank bank = new Bank();
		Count count = new Count(1,1000);
		
		// USER ACCESS
		// check money
		count.getID();
		count.getMoney();
		
		// deposit
		double dep = 1000; // + 1000 €
		count.deposit(dep);
		count.getMoney();
		
		bank.deposit(dep); // + 1000 € - taxes
		bank.getFund();
		
		// withdrawal
		count.withdrawal(3000); // too much
		
		double wit = 1500; // - 1500 €
		count.withdrawal(wit);
		count.getMoney();
		
		bank.withdrawal(wit);
		bank.getFund();
		
		// PROBLEM if getMoney is public
//		count1.setMoney(100000);
//		count1.getMoney();
	}

}
