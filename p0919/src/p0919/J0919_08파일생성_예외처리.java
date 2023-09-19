package p0919;

import java.io.File;
import java.io.IOException;

public class J0919_08파일생성_예외처리 {

	public static void main(String[] args) throws Exception {
		//파일을 1개 생성 File객체는 폴더, 파일을 생성할수 있음.
		//폴더 생성
		File f = new File("c:/bbb");
		f.mkdir();//폴더 생성 코드
		System.out.println("폴더가 생성 되었습니다.");
		File fFile = new File("c:/abc/1.txt");
		try {
			fFile.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}	finally {
			System.out.println("프로그램을 종료합니다.");
		}

	}

}
