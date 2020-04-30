package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {
public static void main(String[] args) {
	
	List<String> names = Arrays.asList("Alex", "Charles", "Brian", "David");
	 
	//Natural order
	Collections.sort(names);    
	//Reverse order
	Collections.sort(names, Collections.reverseOrder());      
	
}
}
