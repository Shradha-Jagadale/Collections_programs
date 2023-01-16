package spring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basic
 {
    public static void main(String[] args)
    {
    	Employee1 emp1 = new Employee1("abc","123","salesman");
    	Employee1 emp2 = new Employee1("xyz","153","clerk");
    	Employee1 emp3 = new Employee1("pqr","133","ceo");
    	Employee1 emp4 = new Employee1("sql","173","manager");
    	
    	List<Employee1> list = new ArrayList<> ();
    	list.add(emp1);
    	list.add(emp2);
    	list.add(emp3);
    	list.add(emp4);
    	
    	System.out.println("Before sorting : "+ list);
    	Collections.sort(list);
    	System.out.println("After Sorting : "+ list);
    }
}
