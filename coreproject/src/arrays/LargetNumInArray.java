package arrays;

import java.util.Scanner;

public class LargetNumInArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter size of array:");
		int size = input.nextInt();
		int[] arr = new int[size];
		System.out.println("enter elements into the Array:");
		for (int i = 0; i < size; i++) {
			
			arr[i] = input.nextInt();

		}
		int value = highestNumInArray(arr);
		System.out.println("largest num" + value);
	}

	public static int highestNumInArray(int[] arr) {
		/*
		 * Considering the first element of the array to be the largest, compare
		 * all the remaining elements of the array, and change the largest value
		 * if assumed largest element is smaller than the element being
		 * compared. At last, the largest element will hold the actual largest
		 * value in the array. Thus, print it.
		 */
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];

			}

		}

		return largest;

	}

}
