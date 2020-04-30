package core.multitithread.interthread;

public class ThreadA {
public static void main(String[] args) throws InterruptedException{
	
ThreadB b=new ThreadB();
b.start();
//Thread.sleep(0,1);
//if we are expecting some updation calling sleep() is not recommnaded,because it will complete one no seconds, 
//and if we are more computations within that tie we may get intermediate value.
//performance issue
//b.join();
//expecting updation calling join() method is not recommanded, updation is ready after completing for loop and suppose 1 core line of code is there
// it has wait 1 core line of code
synchronized (b) {
	System.out.println("main thread trying call wait method");
	b.wait();
	// when we call wait() main thread will goes to waiting state
	System.out.println("main thread got notification");
	System.out.println(b.total);
}


	
}
}

class ThreadB extends Thread{
	int total=0;
	
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	public void run(){
		synchronized (this) {
			System.out.println("child thread starts calcution  ");
			for(int i=1;i<=100;i++){
				 total=total+i;
				
			}
			System.out.println("child thread giving notification");
			this.notify();
		}
		
	}
	
}
//we should use wait and notify methods in syncronized area other wise  will get RE IllegalMonitorState Exception.