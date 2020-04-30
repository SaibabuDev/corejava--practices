package core.multithread;
//program to display all active Thread Names belongs to system group and its child groups.
public class ThreadGroupDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for (Thread t1 : t) {
			System.out.println(t1.getName() + "            " + t1.isDaemon());
		}
	}

}