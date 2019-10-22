package simple;

public class Employee {

	int id;
	String name;
	float basicSalary,hra,da;
	float salary;

	public Employee() {
		
	}

	public Employee(int id, String name, float basicSalary) {
	
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	void calculate()
	{
		hra=(basicSalary*15)/100;
		da=(basicSalary*15)/100;
		salary=basicSalary+hra+da;
	}

	void print() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Salary=" + salary);
	}
}
