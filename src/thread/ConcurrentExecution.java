package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentExecution {

	public static void main(String[] args) {
		PrintName pn = new PrintName();
		PrintAddress pa = new PrintAddress();
		
//		pn.start();
//		pa.start();

		//pool 
//		ExecutorService ex = Executors.newFixedThreadPool(3);//3   q->{25} 
//		ExecutorService ex  = Executors.newCachedThreadPool();//2--N{10 worker -> 3 task }60 second 
		ExecutorService ex = Executors.newSingleThreadExecutor(); //1 worker
		ex.submit(pn);//submit -> task -> thread pool 
		ex.submit(pa);
		ex.shutdown();//release thread pool 
		
		
	}
}

class PrintName extends Thread{
	public void run() {
		System.out.println("run from print name");
	}
}

class PrintAddress extends Thread{
	public void run() {
		System.out.println("run from print address");
	}
}

