package p0905;

import java.util.Scanner;

public class J0905_17숫자맞추기배열수정 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arrNum = new int[10];
		int number = 0; //입력한 숫자
		int count = 0; //도전 획수
		int random = 0; //랜덤 숫자
		
		random = (int)(Math.random()*100)+1; //1~100 : 100개의 랜덤 숫자를 생성
		while(true) {
			System.out.println((count+1)+"번째 숫자를 입력하세요.");
			number = scan.nextInt();
			arrNum[count] = number; //배열에 입력한 숫자 저장
			System.out.println("입력한 숫자 : " + number);
			
			
			count++;
		if (count >9 ) { //입력횟수가 10번인지 확인
			System.out.println("10번 완료! 프로그램 종료합니다.");
			count--;
			break;
		}
		}
		//입력한 숫자 출력
		System.out.println("입력한 숫자");
		for (int i =0; i<10;i++) {
			if(i==0) {
				System.out.print( arrNum[i]);
				continue;
			}
			System.out.print(","+ arrNum[i]);
			
		}
		
		System.out.println();
		//도전 횟수 출력
		System.out.println("도전 횟수: " + (count+1));
		
		//랜덤숫자 출력
		
		System.out.print("랜덤숫자 출력 : "+ random);

	}//main

}//class
