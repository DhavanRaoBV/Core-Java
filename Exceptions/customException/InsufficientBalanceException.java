package customException;

public class InsufficientBalanceException extends Exception {
	
	
public InsufficientBalanceException() {
	
}

public InsufficientBalanceException(String errorMsg) {
	super(errorMsg);
}

@Override
public void printStackTrace() {
	System.out.println("Printing the stack trace");
	super.printStackTrace();
}

public void printException() {
	System.out.println("The exception was caused by Insufficient balance");
}

}

