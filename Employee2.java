package spring;


public class Employee2 {

	private String name;
	private String id;
	private String age;
	
	public Employee2(String name, String id, String age)     // Constructor
	{
		super();
		this.name=name;
		this.id=id;
		this.age=age;
		
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		return "Employee2[name="+name+", id="+id+", age="+age+"]";
	}
	

	public int compareTo(Employee2 e) {
	int value =this.age.compareTo(e.getAge());
	return value;
	}
}
