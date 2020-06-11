package proj6;

public class EncapsulationDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account ();
		
		acc.setAccountName("Fassil Alemayhu");
		acc.setAccountNumber(987643210);
		acc.setAccountDeposit(2589);
		acc.setAccountBalance(1245875);
		
		System.out.println("Name : " + acc.getAccountName());
		System.out.println("Number : " + acc.getAccountNumber());
		System.out.println("Deposit : " + acc.getAccountDeposit());
		System.out.println("Balance : " + acc.getAccountBalance());

	}

}
