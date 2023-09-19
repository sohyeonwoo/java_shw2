package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_07 {

	public static void main(String[] args) {
		String aName = "c:/aaa/1.txt";
		File f = createfile("");
	}
	static File createfile(String fileName) {
	if(fileName == null || fileName=="") {
		fileName = "c:/aaa/제목없음.txt";
	}
	
	File f = new File(fileName);
	try {
		f.createNewFile();
	} catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println(fileName+"파일생성이 되었습니다.");
	return f;
	
}
	
	
	
	
	
	
	
	
	}
