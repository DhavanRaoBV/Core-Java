package objectClass;

import java.util.Scanner;

public class TestPost {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Post p1=new Post();
		Post p2=new Post();
		
		System.out.println("Enter the ID:");
		p1.setPid(sc.nextInt());
		System.out.println("Enter the Body");
		sc.nextLine();
		p1.setPbody(sc.nextLine());
		
		
		System.out.println("Enter the ID:");
		p2.setPid(sc.nextInt());
		System.out.println("Enter the Body");
		sc.nextLine();
		p2.setPbody(sc.nextLine());
		
		System.out.println(p1.equals(p2));
		
		System.out.println(p1);
		System.out.println(p2);	
		
		
		
	}

}
