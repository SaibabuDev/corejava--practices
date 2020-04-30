package arrays;

import java.util.Scanner;

public class SortArrayInAscending {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter size of array:no of elements you want to store");
     int size=input.nextInt();
     //initilizing the array with size
     int num[]=new int[size];
     System.out.println("enter the values into array");
          for(int i=0;i<size;i++){
        	  num[i]=input.nextInt();
        	  
          }
     num= sortArrayInAsc(num);
     System.out.println("Array elements in ascending order");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] +" , ");
		}     
		
	}

	public static int[] sortArrayInAsc(int[] num) {
		int temp;
		
		for (int i = 0; i < num.length; i++) {
			for (int j =i+1; j < num.length; j++) {
				if(num[i]>num[j]){
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
					
				}
				
			}
		}
		
		return num;
		
		
		
		
	}

}
