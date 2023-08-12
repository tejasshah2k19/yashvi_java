package thread;

public class ThreadSumDemo {

	public static void main(String[] args) throws InterruptedException { // main { 6 7 8 } s { 20->100time}
		Sum2 s = new Sum2();// sum 1-100
		s.start = 1;
		s.end = 50;
		Thread t1 = new Thread(s);// 1-50
		t1.start();
		Thread.sleep(100);//50
		s.start = 51;
		s.end = 100;
		Thread t2 = new Thread(s);// 51-100
		t2.start();
		Thread.sleep(100);
		System.out.println(s.sum); // 5050
	}
}

class Sum2 extends Thread {
	int sum = 0;
	int start, end;

	public void run() {
		System.out.println("start >> "+start);
		System.out.println("end >> "+end);
		calculateSum();
	}

	void calculateSum() {
		for (int i = start; i <= end; i++) { // t1 -> 1-50 t2->51-100
			sum = sum + i;
		}
	}
}
