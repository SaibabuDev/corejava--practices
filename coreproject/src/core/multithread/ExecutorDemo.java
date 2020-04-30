package core.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
public static void main(String[] args) {
	PrintJob[] jobs={new PrintJob("durga"),
			new PrintJob("ravi"),
			new PrintJob("sai"),
			new PrintJob("Anil"),
			new PrintJob("pavan"),
			new PrintJob("suresh")};
	ExecutorService service=Executors.newFixedThreadPool(3);
	for (PrintJob job : jobs) {
		service.submit(job);
		
	}
	service.shutdown();
}
}

class PrintJob implements Runnable{

	private String name;
	
	public PrintJob(String name){
		this.name=name;
		
	}
	@Override
	public void run() {
		System.out.println(name+" ...Job strated by thread"+Thread.currentThread().getName());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+" ...Job completed by thread"+Thread.currentThread().getName());
		
	}
	
}