package chars;

import java.io.FileReader;
import java.io.IOException;

public class ReadChar {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\Users\\dhavanrao.v\\Documents\\Dhavan Rao B V(2372538)\\Java(Core)\\IO\\file.txt");

		System.out.println("Opening File");
		int ch = 0;
		while ((ch = fr.read()) != -1) {
			System.out.print((char) ch);
		}

		fr.close();
	}

}