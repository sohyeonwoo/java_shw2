package p0905;

import java.util.Scanner;

public class J0905_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]save = new int[5];
		int random = (int)(Math.random()*10)+1;
		System.out.println(random);
		int i = 0;
		
		
		while (i<5) {
			System.out.println("1~10까지의 숫자를 입력하세요");
			int input = scan.nextInt();
			save[i] = input;
			if(random == input ) {
				System.out.println("정답입니다.");
				break;
			}else if(random < input) {
				System.out.println("더 작습니다.");
			} else {
				System.out.println("더 큽니다.");
			}
			
			
			
		}//while
		
		

		
		//출력
		System.out.println("입력한 숫자: ");
		
	}//main

}//class
