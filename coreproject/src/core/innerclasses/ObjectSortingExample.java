package core.innerclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectSortingExample {

	public static void main(String[] args) {
		   //Creating Order object to demonstrate Sorting of Object in Java
        Order ord1 = new Order(101,20000, "Sony");
        Order ord2 = new Order(102,4000, "Hitachi");
        Order ord3 = new Order(103,6000, "Philips");
     
        //putting Objects into Collection to sort
        List<Order> orders = new ArrayList<Order>();
        orders.add(ord3);
        orders.add(ord1);
        orders.add(ord2);
     
        //printing unsorted collection
        System.out.println("Unsorted Collection : " + orders);
     
        //Sorting Order Object on natural order - ascending
        Collections.sort(orders);
     
        //printing sorted collection
        System.out.println("List of Order object sorted in natural order : " + orders);
        // Sorting object in descending order in Java
        Collections.sort(orders, Collections.reverseOrder());
        System.out.println("List of object sorted in descending order : " + orders);
             
        //Sorting object using Comparator in Java
        Collections.sort(orders, new Order.OrderByAmount());
        System.out.println("List of Order object sorted using Comparator - amount : " + orders);
     //   Comparator sorting Example - Sorting based on customer
        Collections.sort(orders, new Order.OrderByCustomer());
        System.out.println("Collection of Orders sorted using Comparator - by customer : " + orders);
	}

}
class Order implements Comparable<Order>
{
	private int orderId;
	
	private int amount;
	private String customer;
	public Order(int orderId, int amount, String customer) {
		//super();
		this.orderId = orderId;
		this.amount = amount;
		this.customer = customer;
	}
/*	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCustomer() {
		return Customer;
	}
	public void setCustomer(String customer) {
		Customer = customer;
	}*/
	@Override
	public int compareTo(Order o) {
		
		return this.orderId>o.orderId ? 1 : (this.orderId<o.orderId ? -1 : 0);
		
	}
	public String toString(){
		return String.valueOf(orderId);
		
		
	}
	

    /*
     * Comparator implementation to Sort Order object based on Amount
     */
	public static class OrderByAmount implements Comparator<Order>
	{

		@Override
		public int compare(Order o1, Order o2) {
			// TODO Auto-generated method stub
			return o1.amount>o2.amount ? 1 : (o1.amount<o2.amount ? -1 : 0);
		}
		
	}
	/*
     * Anohter implementation or Comparator interface to sort list of Order object
     * based upon customer name.
     */
	 public static class OrderByCustomer implements Comparator<Order> {

	        @Override
	        public int compare(Order o1, Order o2) {
	            return o1.customer.compareTo(o2.customer);
	        }
	    }
}