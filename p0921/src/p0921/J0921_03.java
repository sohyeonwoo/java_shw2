package p0921;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class J0921_03 {

	public static void main(String[] args) throws Exception {

		// StuScore객체 이름,국어,영어,수학을 담아
		// ArrayList 입력한 데이터를 저장하시오.

		ArrayList<StuScore>list = new ArrayList();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = scan.next();
		System.out.println("국어점수를 입력하세요.");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = scan.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		list.add(new StuScore(name,kor,eng,math));
		String data = String.format("%s,%d,%d,%d,%d,%.2f\r\n",name,kor,eng,math,total,avg);
		
		//파일에 저장
		FileWriter fw = new FileWriter("c:/aaa/stu2.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(data);
		bw.close();
		
		System.out.println("파일이 저장되었습니다.");
	}

}
