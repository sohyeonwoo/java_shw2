package p0905;

import java.util.Arrays;
import java.util.Scanner;

public class J0905_14숫자맞추기게임_적었던숫자는기록됨 {

	public static void main(String[] args) {

		//1~100까지 랜덤 숫자 생성해서 맞추는 프로그램 구현하시오.
		   
		//랜덤 숫자 맞추기 게임
		int[] num = new int[10];
			//랜덤숫자 생성
			int random = (int)(Math.random()*100)+1; //1~100까지 랜덤숫자 출력하는 방법
			int i =0;
			Scanner scan = new Scanner(System.in);
			
			
			System.out.println("[숫자 맞추기 게임]");
			System.out.println("한번에 맞추면 100만원 드림");
			
			while (i<10) { //무한반복지정
				if(i==10) {
					break;
				}
				System.out.println("1~100 사이의 숫자를 입력하세요");
				int input = scan.nextInt();
				num[i] = input;
				if(random == input ) { //랜덤수와 입력한 수가 같으면
					System.out.println("정답입니다.");
					break; //랜덤수와 입력한 수가 같으면 실행 종료
				} else if (random > input) {
					System.out.println("입력한 숫자보다 큰수입니다.");
					System.out.println();}
				else {
					System.out.println("입력한 숫자보다 작은수 입니다.");
					
				}
				i++;
			}
			
		
			System.out.print("입력한 숫자 : ");
			for (int j =0;j<i;j++) {
				System.out.printf("%d " ,num[j]);
			}
			System.out.println();
			System.out.println("랜덤숫자 : " + random);
		
		
		
		
		
		
		
//		System.out.println(num); //주소값이 출력
//		System.out.println(Arrays.toString(num)); //배열의 모든값이 출력
		
		
	}

}