
public class CheckingAccount extends BankAccount{
	private double overdraftLimit;

	public CheckingAccount(String accountNumber, String accountHolderName, double balance,double overdraftLimit) {
		super(accountNumber, accountHolderName, balance);
		this.overdraftLimit = overdraftLimit;
		
	}

	@Override
	public String getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String getaccountHolderName() {
		
		return accountHolderName;
	}

	@Override
	public double getbalance() {
		
		return balance;
	}

	@Override
	public void deposite(double amount) {
		balance = balance + amount;
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount>0 && amount < balance) {
			if(amount <  overdraftLimit) {
				balance = balance - amount;
			}
			else {
				System.out.println("withdrawn is overdrafted");
			}
		
	}
	}

}
