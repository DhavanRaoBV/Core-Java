
package employee_Inheritance;


public class employee {
	
	
	protected int eid;
	protected String name;
	protected float totalSal;
	
	
	public  employee() {
		
		
	}


	public employee(int eid, String name) {
		
		this.eid = eid;
		this.name = name;
		
	}
	
	
	public void print() {
		
		System.out.println("Employee ID:"+ eid);
		System.out.println("Employee Name:"+ name);
		System.out.println("Employee Total Salary:"+ totalSal);
		
	}
	
	public void calSal(int days,float wages) {
		totalSal=days*wages;
	}
	
	public void calSal(float bonus,float sal) {
		totalSal=bonus+sal;
	}
	
	
}
