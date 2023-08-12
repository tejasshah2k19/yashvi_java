package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadSumConcurrency {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		TSum t1 = new TSum();
		TSum t2 = new TSum();
		TSum t3 = new TSum();
		TSum t4 = new TSum();
		TSum t5 = new TSum();

		ExecutorService ex = Executors.newFixedThreadPool(3);
		Future<Integer> f1 = ex.submit(t1);
		Future<Integer> f2 = ex.submit(t2);
		Future<Integer> f3 = ex.submit(t3);
		Future<Integer> f4 = ex.submit(t4);
		Future<Integer> f5 = ex.submit(t5);
		
		System.out.println(f1.get()+f2.get()+f3.get()+f4.get()+f5.get());
		
		ex.shutdown();

	}
}

class TSum implements Callable<Integer> {
	Integer sum = 0;

	public Integer call() throws Exception {
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		return sum;
	}
}
