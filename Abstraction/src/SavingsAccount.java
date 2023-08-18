
public class SavingsAccount extends BankAccount{
	private double interestRate;
	public SavingsAccount(String accountNumber,String accountHolderName,double balance,double interestRate) {
		super(accountNumber,accountHolderName , balance);
		this.interestRate = interestRate;
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
			balance = balance - amount;
		}
		else {
			System.out.println("Insufficient balance");
		}
		
	}
	

}
