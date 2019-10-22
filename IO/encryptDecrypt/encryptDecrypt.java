

package encryptDecrypt;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class encryptDecrypt {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Encrypting the Data..............");

		FileInputStream fis = new FileInputStream("C:\\Users\\dhavanrao.v\\Documents\\Dhavan Rao B V(2372538)\\Java(Core)\\IO\\main.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\dhavanrao.v\\Documents\\Dhavan Rao B V(2372538)\\Java(Core)\\IO\\encrypt.txt");
		System.out.println("Encrypted Data");
		int ch = 0;
		while ((ch = fis.read()) != -1) {
			ch+=3;
			fos.write((char)ch);
			System.out.print((char)ch);
		}
		System.out.println("\nEncrypted data is stored in encrypt.txt");
		
		fis.close();
		fos.close();
		
		FileInputStream frs = new FileInputStream("C:\\Users\\dhavanrao.v\\Documents\\Dhavan Rao B V(2372538)\\Java(Core)\\IO\\encrypt.txt");
		System.out.println("Reading the Encrypted Data........");
		System.out.println("Decrypted Data is:");
		int chr=0;
		while ((chr = frs.read()) != -1) {
			chr-=3;
	
			System.out.print((char)chr);
		}
		System.out.println("\nData Decryption Done..");
frs.close();
	}

	
	
}

