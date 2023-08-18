
public class BankAccount {
	private String accountnumber;
	private int balance;
	private String Ownername;
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getOwnername() {
		return Ownername;
	}
	public void setOwnername(String ownername) {
		Ownername = ownername;
	}
	public void Deposting(int amt) {
		if(amt>0) {
			balance = balance + amt;
			System.out.println("Deposting amt "+ balance);
		}
		
	}
	public void withdrawing(int amt) {
		if(amt>0 && amt < balance ) {
			balance = balance - amt;
			System.out.println("withdrawing amt "+ balance);
		}
	}
	public void balance() {
		System.out.println("Balance amt "+ balance);
	}
	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		bank.Deposting(25000);
		bank.withdrawing(5000);
		bank.balance();
		
	}
	}
	
