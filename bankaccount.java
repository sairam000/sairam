class BankAccount {
	private String accountNumber;
	private String accountName;
	private double balance;
	public BankAccount()
	{
	}
	public BankAccount(String accNumber, String accName) {
		accountNumber = accNumber;
		accountName = accName;
		balance = 0;
	}

	public String getAccountName() {
		return accountName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			return true;
		} else {
			return false;
		}
	}

	
	public boolean withdraw(double amount) {
		if (amount > balance) {
			return false;
		} else {
			balance = balance - amount;
			return true;
		}
	}
}
class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc=new BankAccount();
		acc.setAccountNumber("12339");
		acc.setAccountName("sairam");
		acc.setBalance(5000);
		acc.deposit(2000);
		acc.withdraw(500);
		System.out.println("the account number is " + acc.getAccountNumber());
		System.out.println("the Account name is " + acc.getAccountName());
		System.out.println("the balance is " + acc.getBalance());
	}

}

