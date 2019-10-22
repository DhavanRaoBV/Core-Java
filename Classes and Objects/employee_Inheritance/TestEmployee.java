package employee_Inheritance;

public class TestEmployee {

	public static void main(String[] args) {
		consultant c=new consultant(1,"Harish",20,3000);
		c.print();
		permanentEmployee p=new permanentEmployee(2,"Manoj",1000,25000);
		p.print();
	}
	

}
