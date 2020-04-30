package arrays;

public class SubArraySum_Better {
	 public int findSum(int [] arrA){

	        int n = arrA.length;
	        int totalSum = 0;
//	       For ith index the number of occurrences are = (n-i)*(i+1)
//	        Contribution of each element in totalSum is arrA[i]*(n-i)*(i+1)
	        for (int i = 0; i <n ; i++) {
	            totalSum += arrA[i]*(n-i)*(i+1);
	        }
	        return totalSum;
	    }

	    public static void main(String[] args) {
	        int [] arrA = {1,2,3,4};
	        int sum = new SubArraySum_Better().findSum(arrA);
	        System.out.println("Sum of elements of sub arrays is: " +  sum);
	    }
}

/*Let’s observe the behavior for array = {1,2,3,4}

All sub arrays are:

[1] , [1 2], [1 2 3], [1 2 3 4],

[2], [2 3], [2 3 4]

[3], [3 4]

[4]

No of occurrences for each element
1 appears 4 times
2 appears 6 times
3 appears 6 times
4 appears 4 times
For each element at first place – If we observe closely, element at first position, the sub arrays are
For 1 = [1] , [1 2], [1 2 3], [1 2 3 4] and for 2 = [2], [2 3], [2 3 4], for 3 = [3], [3 4] so for element 1, no of occurrence at first position will be equal to n (n=4) here.
Next element which is ‘2’ the number of occurrence at the first position will be one less than n. means n – 1, and so on
So for ith element in array will have appearances at the first position in all the sub arrays will be = (n-i).
So for the first position, occurrences are
1 appears 4 times.
2 appears 3 times.
3 appears 2 times.
4 appears 1 times.
From Step 1 if we subtract the number of occurrences in above step, the remaining occurrences are (i is the iteration index)
1 = 0, n = 4, i = 0
2 = 3, n = 4,  i = 1
3 = 4, n = 4,  i = 2
4 = 3, n = 4, i = 3
From the step above, the formula which will give this result will be = (n-i)*i
So Total number of occurrences for ith index element in array will be = (n-i) + (n-i)*I => (n-i)*(i+1)
So for array {1,2,3,4}
1*(4-0)*(0+1) +
2*(4-1)*(1+1) +
3*(4-2)*(2+1) +
4*(4-3)*(3+1) = 1*4 + 2*6 + 3*6 + 4*4 = 50
Time Complexity: O(n)*/