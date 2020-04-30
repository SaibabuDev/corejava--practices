package arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SortedDistinctElements {
	public static void sortedDistinct(int [] input){

        System.out.println("Given Input: " + Arrays.toString(input));
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i <input.length ; i++) {
            set.add(input[i]);
        }

        //print the set
        System.out.println("Sorted Distinct Elements: ");
        set.forEach(i->System.out.println("sorted elements"+ i));
        
        /*Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }*/
    }

    public static void main(String[] args) {
        int [] input = {6, 1, 8, 5, 2, 10, 17, 25, 6, 5, 1, 8, 8};
        sortedDistinct(input);
    }
}
