package interfaces;

public class TestPrintable {

	public static void main(String[] args) {

		Printer p = new Printer();
		p.print();
		
		Printable pr = new Printer();
		//p.name = "HP Printer";
		pr.print();
	}
}