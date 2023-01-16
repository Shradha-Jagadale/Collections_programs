package spring;


public class Employee implements Comparable<Employee>
{
private String name ;
private String id;

public Employee(String name, String id) {
	super();
	this.name = name;
	this.id = id;
	
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}


@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + "]";
}


@Override
public int compareTo(Employee o) {
int value =this.id.compareTo(o.getId());
return value;
}

}