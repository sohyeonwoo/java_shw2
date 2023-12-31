package p0920;

import java.util.Scanner;

public class J0920_05 {

	public static void main(String[] args) {

		// 주민번호 880101-1101111 //100101-3303333
		// 1,2 - 1900년대 //3,4 - 2000년대
		// 입력한 주민번호를 확인해서 나이를 출력하시오
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		String input = scan.next();
		// 나이계산
		char ch = input.charAt(7);
		String str = input.substring(0, 2);
		String year = "";
		int age = 0;
		System.out.println(ch);
		if (ch == '1' || ch == '2') {
			year = "19" + str;
			age = 2023 - Integer.parseInt(year);
		} else {
			year = "20" + str;
			age = 2023 - Integer.parseInt(year);
		}
		System.out.println("당신의 나이 : " + age);
		
		// 2. 계절확인 겨울 : 12,1,2 봄 : 3,4,5 여름 : 6,7,8 가을 : 9,10,11
		//당신이 태어난 계절 : 가을
		
		String s = input.substring(2,4);
		String season = " ";
		switch(s) {
		case "12" :case "01" :case "02":
		season = "겨울";
		break;
		case "03" :case "04" :case "05":
		season = "봄";
		break;
		case "06" :case "07" :case "08":
		season = "여름";
		break;
		case "09" :case "10" :case "11":
		season = "가을";
		break;
		}
	System.out.println("당신이 태어난 계절은 : "+season);
	}
		
		
}

