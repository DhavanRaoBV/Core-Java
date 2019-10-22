package encapsulation;

public class Employee {

	int id;
	float salary;
	String name;
	public Employee()
	{
		
	}
	
	
	public Employee(int id, float salary, String name) {
		
		
		this.id = id;
		this.salary = salary;
		this.name = name;
		
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	void print()
	{
		
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		
	}
	
	
}
