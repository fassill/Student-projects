package proj6;

class Account {
	
	private String accountName;
	private int accountNumber;
	private int accountDeposit;
	private int accountBalance;
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccountDeposit() {
		return accountDeposit;
	}
	public void setAccountDeposit(int accountDeposit) {
		if (accountDeposit < 0) {
			System.err.println("error msg");
		}
		else {
		this.accountDeposit = accountDeposit;
        	}
	   }
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	
}
