package p0919;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class J0919_15 {

	public static void main(String[] args) throws Exception {
		File f = new File("c:/bbb");
		if (!f.exists()) {
			f.mkdir();
		}

		FileInputStream fis = new FileInputStream("C:/aaa/ko1.jpg");
		FileInputStream fis2 = new FileInputStream("C:/aaa/lee2.jpg");
		FileOutputStream fos = new FileOutputStream("c:/bbb/ko1.jpg");
		FileOutputStream fos2 = new FileOutputStream("c:/bbb/lee2.jpg");

		while (true) {
			int read = fis.read();
			int read2 = fis2.read();
			if (read == -1)
				break;
			fos.write(read);
			fos.write(read2);

		}
		fis.close();
		fis2.close();
		fos.close();
		fos2.close();

	}

}
