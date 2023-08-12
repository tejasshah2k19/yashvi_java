package thread;

public class ThreadDemo2 {

	public static void main(String[] args) {
		PrintNumber p = new PrintNumber();
		CopyNumber c = new CopyNumber();
//		p.print();
		p.start();//
		try {
			p.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.start();
	}
}
//1) extends Thread 
//2) public void run() 
//3) start() 

class PrintNumber extends Thread {

	public void run() {
		print();
	}

	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("i => " + i);// 1mb -| 5mb | 3mb OS
		}
	}
}

//copy
class CopyNumber extends Thread {

	public void run() {
		copy();
	}

	void copy() {
		for (int j = 1; j <= 10; j++) {
			System.out.println("j => " + j);// 1mb -| 5mb | 3mb OS
		}

	}

}