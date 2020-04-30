package core.multithread;

public class ThreadGroupDemo3 {
public static void main(String[] args) throws InterruptedException {
	ThreadGroup pg=new ThreadGroup("parent Group");
	ThreadGroup cg=new ThreadGroup(pg,"child Group");
	MyThread t1=new MyThread(pg, "child THread1");
	MyThread t2=new MyThread(pg, "child THread2");
	t1.start();
	t2.start();
	System.out.println(pg.activeCount());
	System.out.println(pg.activeGroupCount());
	pg.list();
	Thread.sleep(10000);
	System.out.println(pg.activeCount());
	System.out.println(pg.activeGroupCount());
	pg.list();
	
	}
}
class MyThread extends Thread{
	
	public MyThread(ThreadGroup g,String name) {
	 super(g, name);
	 
	}
public void run(){
	System.out.println("child Thread");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}	
	

}