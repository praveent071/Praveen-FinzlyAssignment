
public class Main {
	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount("ui351","praveen",5000.0,0.5);
		CheckingAccount check = new CheckingAccount("jfv5616","arul",2561.0,2000.0);
		System.out.println("Balance "+savings.getbalance());
		savings.deposite(2000.0);
		System.out.println("Balance "+savings.getbalance());
		savings.withdraw(1000.0);
		System.out.println("Balance "+savings.getbalance());
		System.out.println("Balance "+check.getbalance());
		check.deposite(2053.0);
		System.out.println("Balance "+check.getbalance());
		check.withdraw(2502.0);
		System.out.println("Balance "+check.getbalance());
		
		
		
		
		
	}

}
