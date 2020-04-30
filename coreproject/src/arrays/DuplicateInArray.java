package arrays;

import java.util.HashSet;

public class DuplicateInArray {

	public static void main(String[] args) {
		String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		  
        HashSet<String> set = new HashSet<String>();
  
        for (String arrayElement : strArray)
        {
        	//when we try to aqdd duplicate element hashset retruns false
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
    }    
	}

