package bytes;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBytes {

	public static void main(String[] args) throws IOException {
		String data = "Java can reduce costs, drive innovation, and improve application services as the programming language of choice for IoT, enterprise architecture, and cloud computing.";

		FileOutputStream fos = new FileOutputStream("C:\\Users\\dhavanrao.v\\Documents\\Dhavan Rao B V(2372538)\\Java(Core)\\IO\\writeBytes.txt");

		System.out.println("Writing Data");
			
		fos.write(data.getBytes());
		
		System.out.println("Writing Data Complete");
		fos.close();

	}

}