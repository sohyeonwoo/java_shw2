package p0905;

import java.util.Scanner;

public class p0905_16숫자맞추기완벽수정본 {

	public static void main(String[] args) {
		// 1-100 랜덤숫자를 생성해서 맞추는 프로그램을 구현하시오
		// 1 . 1~100까지 랜덤숫자 생성
		// 2. 입력
		// 3. 비교
		// 4. 출력
		// 변수 , 클래스 선언

		Scanner scan = new Scanner(System.in);
		int random = 0;
		int count = 0; // 카운트 변수 //숫자 개수를 입력하는 메소드
		int number = 0;
		int[] arrNum = new int[10];

		random = (int) (Math.random() * 100) + 1; // 1~100까지 랜덤숫자
		System.out.println("랜덤숫자 :" + random);
		// 무한 반복
		while (true) {

			System.out.println("숫자를 입력하세요.");
			number = scan.nextInt();
			arrNum[count] = number; // 입력된 숫자 배열에 저장

			if (random == number) { // 랜덤 숫자와 적은 숫자가 맞는지 비교
				System.out.println("정답입니다.");
				break;
			}
			count++;
			
			if (count > 9) { // 도전 횟수가 10번인지 확인
				System.out.println("10번의 기회를 소진하였습니다. 프로그램 종료합니다");
				count--;
				break;
			}

		} // while
		System.out.println("도전 횟수 : " + (count+1));
		System.out.print("입력한 숫자 : ");
		for (int i = 0; i < count; i++) {
			System.out.print(arrNum[i]+" ");
		}

		System.out.println();
		System.out.println("랜덤 숫자 : " + random);

	}// class

}// main
