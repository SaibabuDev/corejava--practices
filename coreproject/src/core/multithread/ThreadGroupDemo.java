package core.multithread;

public class ThreadGroupDemo {
	//every thread in java belongs to some group
	//main thread belongs to main 9group
	//every thread group in java i9s the child group system group either direclty or indirectly hence
	//system group acts as root for all thread Group in java
 public static void main(String[] args) {
	 
	 
	 System.out.println(Thread.currentThread().getName());
	 
	System.out.println(Thread.currentThread().getThreadGroup().getParent());
	
	ThreadGroup g1=new ThreadGroup("Fist group");
	System.out.println(g1.getParent().getName()); //main
	ThreadGroup g2=new ThreadGroup(g1,"Fist group");
	System.out.println(g1.getParent().getName()); // First Group

}
 
}

//output: main
//+java.lang.ThreadGroup[name=system,maxpri=10]

// system group contains serveral system level threads
/*Finalizer
Reference Handler
 Signal Dispatacher
 Attach Listener etc.
*/