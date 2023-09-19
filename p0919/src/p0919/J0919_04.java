package p0919;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class J0919_04 {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\KOREAVC\\Downloads/로또1등되게해주세요.txt");
		if (!f.exists()) {
			try {
				f.createNewFile(); // 하드디스크에 저장 명령
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter writer = new BufferedWriter(fw);
			writer.write("안녕하세요 반갑습니다 로또 1등되게 해주세요. \r\n로또 1등되게 해주세요 \r\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("파일이 생성되었습니다.");

	}

}
