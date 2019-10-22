package Grade;

import java.util.Scanner;

public class Test {
public static void  main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Student id");
	int sid=sc.nextInt();
	
	System.out.println("Enter Student Name");
	String name=sc.next();
	
	System.out.println("Enter Student Percentage");
	int perc=sc.nextInt();
	
	Student s=new Student(name,sid,perc);
	s.print();
	s.display(perc);
	
}

}
