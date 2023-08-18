
public abstract class BankAccount {
	protected String accountNumber;
	protected String accountHolderName;
	protected double balance;
	
	public BankAccount(String accountNumber,String accountHolderName,double balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	public abstract String getAccountNumber();
	public abstract String getaccountHolderName();
	public abstract double getbalance();
	public abstract void deposite(double amount);
	public abstract void withdraw(double amount);
	
	

}
