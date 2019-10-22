package customException;

import java.util.Scanner;

public class TestUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,pwd;
		System.out.println("Enter the name");
		name=sc.next();
		System.out.println("Enter the Password");
		pwd=sc.next();
		
		
		try {
			 User usr=new User(name,pwd);
			 usr.UserAuthenticate(pwd);
			 usr.Print();
		} catch (InsufficientLengthException e) {
			e.printStackTrace();
			e.printException();
		}
		 
	}

}
