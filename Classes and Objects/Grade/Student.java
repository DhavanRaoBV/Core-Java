package Grade;

public class Student {

	
	
	String name;
	int sid;
	int perc;
	
	
	public Student(String name, int sid, int perc) {
		super();
		this.name = name;
		this.sid = sid;
		this.perc = perc;
	}
	
	void print()
	{
		System.out.println("Name: "+name);
		System.out.println("Id: "+sid);
		
		
	}
	 void display(int perc)
	 { 
		 if(perc<35)
		 System.out.println("FAIL");
		 else if(perc>=35 && perc<=39)
			 System.out.println("Grade obtained is E");
		 else if(perc>=40 && perc<=49)
			 System.out.println("Grade obtained is D");
		 else if(perc>=50 && perc<=59)
			 System.out.println("Grade obtained is C");
		 else if(perc>=60 && perc<=69)
			 System.out.println("Grade obtained is B");
		 else if(perc>=70 && perc<=79)
			 System.out.println("Grade obtained is A");
		 else if(perc>=80 && perc<=89)
			 System.out.println("Grade obtained is S");
		 else 
			 System.out.println("Grade obtained is S+");
	 }
	
	
	
	
}

