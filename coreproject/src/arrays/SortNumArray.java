package arrays;

import java.util.Scanner;

public class SortNumArray {

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	 int n=	input.nextInt();
	  System.out.println("enter size of array:"+n);
	  //create the array size with n
	  int[] numarr=new int[n];
	  System.out.println("enter the n elements into array");
	  for (int i=0;i<numarr.length;i++){
		 numarr[i]= input.nextInt();
	  }
 int[] sortedArr= sortNumberArray(numarr);
	  for (int i = 0; i < sortedArr.length; i++) {
		System.out.println("sorted element"+sortedArr[i]);
	}
	  
	  
	}

	public static int[] sortNumberArray(int[] numarr) {
		
		for (int i = 0; i < numarr.length; i++) {
			for (int j = i+1; j < numarr.length; j++) {
				if(numarr[i]>numarr[j]){
					int temp=numarr[i];
					numarr[i]=numarr[j];
					numarr[j]=temp;
				}
			}
		}
		return numarr;
		
		
	}
	
}
//in this approach time complexity O(n2)