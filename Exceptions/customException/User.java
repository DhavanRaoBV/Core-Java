package customException;

public class User {

	
	String name,password;
	
	public User() {
		
		
	}
	
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	void UserAuthenticate(String password) throws InsufficientLengthException{
		if(password.length()<6)
			throw new InsufficientLengthException("Password Length Insufficient");
		
	}


	void Print() {
		System.out.println("User Credentials are Valid");
		System.out.println("Name:"+name+"\n"+"Password:"+password);
	}
	
}
