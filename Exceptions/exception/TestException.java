package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class TestException {

	void foo() throws IOException {
		FileInputStream din = new FileInputStream("");
	}

	void bar() {
		try {
			foo();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestException test = new TestException();
		test.bar();

		try {
			System.out.println(9 / 0);
			FileInputStream din = new FileInputStream("");
		} catch (ArithmeticException ae) {
			System.out.println("Can't divide by 0");
		} catch (IOException io) {
			System.out.println("Some issue with IO");
		} catch (Exception e) {
			System.out.println("Some unknown error");
		} finally {
			System.out.println("Finally");
		}
	}

}