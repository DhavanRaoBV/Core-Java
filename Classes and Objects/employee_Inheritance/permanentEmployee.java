package employee_Inheritance;

public class permanentEmployee extends employee{
	
	float bonus;
	float sal;
	
	public permanentEmployee() {
	       super();	
	}
	
	public permanentEmployee(int eid,String name,float bonus, float sal) {
		super(eid,name);
		this.bonus = bonus;
		this.sal = sal;
	}

   public void print() {
	    super.calSal(bonus, sal);
	    super.print();
		System.out.println("Bonus:"+bonus);
		System.out.println("Salary:"+sal);
	}
	
		
	

}
