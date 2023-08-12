package thread;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Print p = new Print();
		Copy c = new Copy();
		// p.print();//10 mb
		p.start();// 2 mb
		p.join();
		c.start(); // 2 mb
	}
}

//1) extends Thread 
//2) run()
//3) start() thread invoke 
class Print extends Thread {

	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Print =>  " + i);// 10 time print -> print
		}
	}

	// override -> Thread
	public void run() {
		print();
	}
}

class Copy extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Copy => " + i);
		}
	}
}