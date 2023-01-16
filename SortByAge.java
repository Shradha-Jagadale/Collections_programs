package spring;

import java.util.Comparator;
public class SortByAge implements Comparator<Employee2> 
{
@Override
public int compare(Employee2 emp1, Employee2 emp2)
{
	return emp1.getAge().compareTo(emp2.getAge());
}
}
