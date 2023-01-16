package spring;

public class Employee1 implements Comparable<Employee1>
{
private String id;
private String name;
private String dept;

public Employee1(String name, String id, String dept)
{
	super();
	this.name=name;
	this.id=id;
	this.dept=dept;
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Override
public String toString()
{
	return "Employee1 [name=" + name + ", id=" + id + ", dept=" + dept+"]";
}

@Override
public int compareTo(Employee1 o)
{
	int value = this.dept.compareTo(o.getDept());
	return value;
}
}
