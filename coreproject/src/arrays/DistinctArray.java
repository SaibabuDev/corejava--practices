package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*Better Solution:

Use HashSet:
Create a HashSet from the given array.
Since Set does not contains duplicates, if original array has any duplicates, the size of HashSet will not be equal to the size of array and if size matches then array has all unique elements.
Time Complexity: O(N) , Space Complexity: O(N)*/
public class DistinctArray {

	public static void main(String[] args) {
		
		Integer [] arrA = { 1, 2, 3, 6, 4, 9, 8};
		Integer [] arrB = { 1, 2, 3, 6, 4, 9, 8, 2};
		isDistinctArray(arrA);
		isDistinctArray(arrB);
	}

	 static void isDistinctArray(Integer[] arr) {
		
		 //Create Set with all the elements in the array
		 Set set=new HashSet<>(Arrays.asList(arr));
		 //since Set cannot contain duplicates, so if array size and
	        // HashSet size then it can be concluded that array has all
	        //distinct or unique elements otherwise its not
		 if(arr.length==set.size()){
			 
			 System.out.println("Given array has unique elements");
			 
		 }
		 else
			 System.out.println("Given array has duplicate elements");
			 
		 
		 }

}
