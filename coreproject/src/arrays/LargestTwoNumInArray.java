package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LargestTwoNumInArray {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=input.nextInt();
		int[] arr=new int[size];
	System.out.println("enter elements into the array");
	for(int i=0;i<size;i++){
		arr[i]=input.nextInt();
		
	}
	  twoHighestNum(arr);
	  
/*	//sort the array 
      // Arrays.sort(arr);
       //System.out.println("second largest"+arr[size-2]);
     //  System.out.println("first largest"+arr[size-1]);
     //sort the array decreasing order
	// Note that we have Integer here instead of 
      // int[] as Collections.reverseOrder doesn't 
      // work for primitive types. 

	  Arrays.sort(arr,Collections.reverseOrder());
*/	}

	public static void twoHighestNum(int[] arr) {
		
		         
		int largest1,largest2,temp;
		
		largest1=arr[0];
		largest2=arr[1];
		
		if(largest1<largest2){
			temp=largest1;
			largest1=largest2;
			largest2=temp;
		}
		
		for(int i=2;i<arr.length;i++){
			
			if(largest1<arr[i]){
				
				largest2=largest1;
				
				largest1=arr[i];
				
				
				
			}
			
			else if(arr[i]>largest2 && largest1!=arr[i]){
				
				largest2=arr[i];
				
			}
		}
		System.out.println("first hihest num"+largest1);
		System.out.println("second highest num"+largest2);
		
		
		
	}
	
	
	

}
