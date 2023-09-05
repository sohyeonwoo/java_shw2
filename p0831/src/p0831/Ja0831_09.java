package p0831;

import java.util.Scanner;

public class Ja0831_09 {

	public static void main(String[] args) {
		// 출력 = println , print , printf
		// 입력 = Scanner 
		//String str = new String("abc");
		
		Scanner scan = new Scanner(System.in); //입력 : 현재 시스템 화면에서 입력받음
		System.out.println("당신의 원하는 숫자를 입력하세요.");
		int number = scan.nextInt();
		System.out.println("입력한 숫자 :"+number);
	}

}
