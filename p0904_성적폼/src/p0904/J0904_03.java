package p0904;

import java.util.Scanner;

public class J0904_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//문자 0애서 9사이의 문자이면 문자 숫자입니다. 문자 숫자가 아닙니다 출력하시오
		
		System.out.println("문자를 입력하세요.");
		String result = scan.nextLine();
		
		
		char result1 = scan.next().charAt(0);
		if(result1>='0' && result1 <='9') {
			System.out.println("숫자가 입력되었습니다.");
		}	else {
			System.out.println("숫자가 아닙니다.");
		}
		
		result1 = result.charAt(1);
		if(result1>='0' && result1 <='9') {
			System.out.println("숫자가 입력되었습니다.");
		}	else {
			System.out.println("숫자가 아닙니다.");
		}


		// 알파벳 x,X를 입력하면 프로그램을 종료합나디. 라고 출력하시오
//
//		System.out.println("프로그램을 종료하려면 x 또는 X를 입력하세요.");
//		char result = scan.next().charAt(0); // charAt 문자열 ->문자변경 명령어
//
//		if (result == 'x' || result == 'X') {
//			System.out.println("프로그램을 종료합니다.");
//		}

	}//main

}//class
