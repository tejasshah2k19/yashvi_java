package thread;

public class ThreadSum {

	public static void main(String[] args) throws InterruptedException {

		Sum s = new Sum();

		synchronized (s) {

			s.start();
			s.wait();// synchronized 
		}
		
		s.printSum();
	}
}

class Sum extends Thread {
	int sum = 0;

	public void run() {
		doSum();
	}

	synchronized void doSum() {

		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("After Loop " + sum);
		notify();
	}

	void printSum() {
		System.out.println(sum);
	}
}
