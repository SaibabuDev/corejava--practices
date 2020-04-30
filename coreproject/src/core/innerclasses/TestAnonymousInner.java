package core.innerclasses;

abstract class Person{
	abstract void eat();
}


public class TestAnonymousInner {

	public static void main(String[] args) {

		Person p = new Person() {

			void eat() {
				System.out.println("Nice fruits");

			}
		};
     p.eat();
	}

	/*
	Person p=new Person(){  
		void eat(){System.out.println("nice fruits");}  
		};  
		A class is created but its name is decided by the compiler which extends the Person class and provides the implementation of the eat() method.
		An object of Anonymous class is created that is referred by p reference variable of Person type.*/
	
}