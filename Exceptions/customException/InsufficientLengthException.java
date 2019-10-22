package customException;

public class InsufficientLengthException extends Exception {
	
	public InsufficientLengthException() {
		
	}

	
	public InsufficientLengthException(String errorMsg) {
		super(errorMsg);
		
	}


	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("Printing the stack trace");
		super.printStackTrace();
	}
	
	public void printException() {
		System.out.println("The exception was caused by Insufficient length of Password");
	}
	
	
}
