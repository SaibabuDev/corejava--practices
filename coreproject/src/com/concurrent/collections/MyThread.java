package com.concurrent.collections;

import java.util.ArrayList;
import java.util.Iterator;

class MyThread extends Thread{
	static ArrayList list=new ArrayList<>();
	public void run(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child thread updating list");
		list.add("D");
		
	}
	public static  void main(String[] args) throws InterruptedException {
		list.add("A");
		list.add("B");
		list.add("C");
		MyThread t=new MyThread();
		t.start();
	Iterator<String> itr=list.iterator();
	while (itr.hasNext() ){
		 String s1 =  itr.next();
		 
		 System.out.println("main thread iterating list and current object is "+s1);
		 
		 Thread.sleep(1000);
		
	}
		System.out.println(list);
		
	}
	
	
}
//output
/*main thread iterating list and current object is A
child thread updating list
Exception in thread "main" java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at com.concurrent.collections.MyThread.main(MyThread.java:27)
*/
