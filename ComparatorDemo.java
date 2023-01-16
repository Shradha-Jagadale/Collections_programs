package spring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args)
	{
		Employee2 emp5=new Employee2("Aanu","102","34");
		Employee2 emp6=new Employee2("Lila","111","40");
		Employee2 emp7=new Employee2("Tanu","109","24");
		Employee2 emp8=new Employee2("Rutu","107","31");
		
		List<Employee2>list=new ArrayList<>();
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		list.add(emp8);
		
		System.out.println("Before Sorting : " +list);
		
		Collections.sort(list, new SortByAge());
		
		System.out.println("After Sorting :"+list);
	}
}
