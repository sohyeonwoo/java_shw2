package p0907;

import java.util.Scanner;

public class J0907_05연금복권코드 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 연금복권 1조 12345 00000~99999
		// 1조 - 1~9까지의 숫자
		int fNo = (int) (Math.random() * 9) + 1; // 0~9까지 랜덤 숫자
//		int firstNo2 = (int)(Math.random()*9)+1; //1~9까지 랜덤 숫자

		int sNo = (int) (Math.random() * 100000);// 0~99999까지 랜덤 숫자
		String strNo = String.format("%05d", sNo); // stting.format 을 넣어서 String타입으로 변경됨
		String wN = fNo + "조" + sNo;

		// 복권입력
		System.out.println("조 단위를 입력하세요.(1~9조 까지)");
		int input1 = scan.nextInt();
		System.out.println(input1 + "조 00000 5자리 입니다.");
		System.out.println("뒤 5자리를 입력하세요.");
		String input2 = scan.next();

		String inputNo = input1 + "조" + input2;
		System.out.println("-------복권확인-------");
		System.out.printf("당첨번호 : %s\n", wN); // %d 정수 . %f실수 , %s문자열 . %c 문자
		System.out.println("입력번호 : " + inputNo);

		int count = 0;

		if (inputNo.charAt(6) == wN.charAt(6)) {
			System.out.println("일치합니다.");
			count++;
			if (inputNo.charAt(5) == wN.charAt(5)) {
				System.out.println("일치합니다");
				count++;
				if (inputNo.charAt(4) == wN.charAt(4)) {
					System.out.println("일치합니다.");
					count++;
					if (inputNo.charAt(3) == wN.charAt(3)) {
						System.out.println("일치합니다.");
						count++;
						if (inputNo.charAt(2) == wN.charAt(2)) {
							System.out.println("일치합니다.");
							count++;
							if (inputNo.charAt(1) == wN.charAt(1)) {
								System.out.println("일치합니다.");
								count++;
							}
						}
					}
				}
			}
		}
			if (count == 0) 
				System.out.println("-            메렁             -");
			else if (count == 1)
				System.out.println("1개 맞췄습니다 . 당첨 1,000원 ㅋㅋㅋㅋㅋ");
			else if (count == 2)
				System.out.println("2개 맞췄습니다 . 당첨 5,000원");
			else if (count == 3)
				System.out.println("3개 맞췄습니다. 당첨 10,000원");
			else if (count == 4)
				System.out.println("4개 맞췄습니다. 당첨 100,000원");
			else if (count == 5)
				System.out.println("5개 맞췄습니다. 당첨 10,000,000원");
			else if (count == 6)
				System.out.println("6개 맞췄습니다. 축당첨 집한채!");

		
	}// main
}// class
