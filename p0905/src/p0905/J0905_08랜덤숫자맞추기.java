package p0905;

import java.util.Scanner;

public class J0905_08랜덤숫자맞추기 {

	
	   //랜덤 숫자 맞추기 게임
	public static void main(String[] args) {
		//랜덤숫자 생성
		int random = (int)(Math.random()*10)+1;
		Scanner scan = new Scanner(System.in);
		int i = 0;
		System.out.println("임시 : " + random);
		System.out.println("[숫자 맞추기 게임]");
		
		while (i<10) { //true 무한반복
			System.out.println("1~10 사이의 숫자를 입력하세요");
			int num = scan.nextInt();
			if(random == num ) {
				System.out.println("정답입니다.");
				break;
			} else if (random > num) {
				System.out.println("입력한 숫자보다 큰수입니다.");
				System.out.println();}
			else {
				System.out.println("입력한 숫자보다 작은수 입니다.");
				
			}
		}
		
		System.out.println("랜덤숫자 : " + random);
		
		//무한반복
//		int i =0;
//		while(true) {
//			System.out.println(i);
//			i++;
//		}
		
		//무한반복
//		int i = 0;
//		for (;;i++) {
//			System.out.println(i);
//		}
	}//main

}//class
