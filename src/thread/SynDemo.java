package thread;

public class SynDemo {
	public static void main(String[] args) {

		Bank b = new Bank();

		Thread t1 = new Thread(b);
		t1.setName("amar");
		Thread t2 = new Thread(b, "akbar");
		Thread t3 = new Thread(b);
		t3.setName("anthony");
		t1.start();
		t2.start();
		t3.start();

	}
}

class Bank extends Thread {
	int balance;

	Bank() {
		this.balance = 20000;
	}

	synchronized void wid(int amt) {

		System.out.println(currentThread().getName() + " is Wid");
		if (this.balance == 0) {
			System.out.println(currentThread().getName() + " can't wid");
		} else {
			this.balance = this.balance - amt;
			System.out.println("wid done for "+currentThread().getName()+" and Remaining balance => " + balance);
		}
	}

	public void run() {
		wid(10000);
	}
}