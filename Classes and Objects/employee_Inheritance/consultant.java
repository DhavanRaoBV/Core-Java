package employee_Inheritance;

public class consultant extends employee {
	
	int days;
	float wages;
	

	public consultant() {
		super();
		
	}


	public consultant(int eid,String name,int days, float wages) {
		super(eid,name);
		this.days = days;
		this.wages = wages;
	}
	
	public void print() {
		super.calSal(days, wages);
		super.print();
		System.out.println("No of days:"+days);
		System.out.println("Wages:"+wages);
		
		
	}
	

}
