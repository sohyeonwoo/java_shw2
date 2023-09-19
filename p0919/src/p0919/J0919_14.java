package p0919;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class J0919_14 {

	public static void main(String[] args) throws Exception {
		File f = new File("c:/bbb");
		if(!f.exists()) {
			f.mkdir();
		}
		FileInputStream fis = new FileInputStream("c:/aaa/ko1.jpg");//파일 읽기
		FileOutputStream fos = new FileOutputStream("c:/bbb/ko1.jpg");
		
		while(true) {
			int read = fis.read();
			if(read==-1) break;
			fos.write(read);
		}
		fis.close();
		fos.close();
		System.out.println("파일이 저장되었습니다.");
		

	}

}
