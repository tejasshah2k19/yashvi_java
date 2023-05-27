public class SavingAccount {

	String name;
	int balance;
	String ifcCode;

	static int branchCode;
	
	// constructor - class name -> method -> without return type
	public SavingAccount() {
		balance = 10000;
		ifcCode = "ICICI12345";
	}

	public SavingAccount(int balance) {
		this.balance = balance;
		//this.balance -> it consider balance from instance variable 
	}

	public static void main(String[] args) {

		SavingAccount sa = new SavingAccount();
		System.out.println(sa.balance); // 10000

		SavingAccount sa1 = new SavingAccount(25000);
		System.out.println(sa1.balance);
	}
}
