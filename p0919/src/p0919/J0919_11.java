package p0919;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class J0919_11 {

	public static void main(String[] args) {
try {
	FileReader fr = new FileReader("c:/aaa/2.txt");
	BufferedReader br = new BufferedReader(fr);
	while(true) {
		String line = br.readLine();
		if(line==null) break;
		System.out.println(line);
	}
	br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
