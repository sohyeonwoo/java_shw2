package p0919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class J0919_10 {

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
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
