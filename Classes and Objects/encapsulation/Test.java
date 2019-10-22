package encapsulation;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		
		Scanner Scan =new Scanner(System.in);
		/*Employee e1=new Employee();
		
		System.out.println("Enter ID:");
		e1.setId(scan.nextInt());
		
		System.out.println("Enter Name");
		e1.setName(scan.next());
		
		System.out.println("Enter Salary");
		e1.setSalary(scan.nextFloat());*/

		
		System.out.println("Enter ID,Salary and Name");
		Employee e2=new Employee(Scan.nextInt(),Scan.nextFloat(),Scan.next());
		//e1.print();
		e2.print();
		
		
		
		
	}

	

}
