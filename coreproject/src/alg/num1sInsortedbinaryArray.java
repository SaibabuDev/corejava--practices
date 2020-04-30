package alg;

import java.util.Scanner;

public class num1sInsortedbinaryArray {
	
	
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++ ){
			
			arr[i]=sc.nextInt();
		
		}
*/
		int[] arr = {0,0,0,1,1,1,1};
		//System.out.println(solve(arr));
		System.out.println(solveEfficient(0, arr.length-1,arr));
	}
/*
	public static int solve(int[] arr) {
		int currPointer = 0;
		while (currPointer < arr.length) {
			if (arr[currPointer] == 1) {
			// as we have found our first one, we will stop here and 
                        // result would be (arr.length-currPinter)
				break;
			}
			// we will keep on increasing currPoniter as long as we are 
                        //encountering zeroes
			currPointer++;
		}
		return (arr.length - currPointer);
	}*/
	
	public static int solveEfficient(int start, int end, int[] arr) {
		if (arr[start] == 1) {
		// start elem is one, hence all other elements will be one in 
                // virtual subarr.
			return end - start + 1;
		}
 
		if (arr[end] == 0) {
	         // end elem is zero this means, all previous elements of 
                 //subarr will be zeroes.
			return 0;
		}
 
		int mid = (start + end) / 2;
		int leftResult = solveEfficient(start, mid, arr);
		int rightResult = solveEfficient(mid + 1, end, arr);
		// divide the array into two virtual subHalves
		return leftResult + rightResult;
 
	}

}
