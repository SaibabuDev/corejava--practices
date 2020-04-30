package arrays;

import java.util.Arrays;

/*Pros and cons of Bubble sort:

Pros: Bubble sort algorithm is considered as very simple sorting technique since all you need to do is compare all the adjacent elements and swap them if they are in wrong order.
Cons: Main drawback of bubble sort is its time complexity which is O(N2) since all the pairs are compared, even when the original array is sorted.*/

/*How we can improve Bubble sort:
bubble sort compares all the pairs in the array, even when original array is sorted or partially sorted. 
this is where we can do some improvements.
During any iteration, if there are no swaps then we can claim that our array is already sorted.*/

public class OptimizedBubbleSort {
	 public static void main(String[] args) {
	       // int [] arrA = {5, 1, 9, 3, 2, 10};
	     //   sort(arrA);
	        System.out.println("------------------------------");
	   int[]     arrA = new int []{1, 2, 4, 6, 8, 10};
	        sort(arrA);
	    }

	 static void sort(int[] array) {
		 if(array==null || array.length==0)
	            return;
		 
		 
		 System.out.println("Original Array: " + Arrays.toString(array));
		 boolean isSwapped =false;
	        int size = array.length;
	        for (int i = 0; i < size-1; i++) {
				// isSwapped=false;
				for(int j=0;j<size-1;j++){
					
					//check the adjacent element 
					if(array[j]>array[j+1]){
						
						int temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
						
						isSwapped=true;
						
					}
					
					}
				if(isSwapped==false){
					break;
				}
			}
	        System.out.println("Sorted Array: " +  Arrays.toString(array)); 
		 
	}
}
