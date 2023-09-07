package p0907;

import java.util.Scanner;

public class J0907_06로또번호맞추기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 선언
		int[] lotto = new int[45];
		int temp = 0;
		int[] myN = new int[6];
		int[] winN = new int[6];
		int count = 0;
		
		
		// 로또 번호 순차입력
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1; // 1~45
		}
		// 로또 섞기
		for (int i = 0; i < 300; i++) {
			int random = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}

		// 6개 로또번호 추출
		for (int i = 0; i < 6; i++) {
			winN[i] = lotto[i];
		}
		System.out.println();

		// 직접입력
		for (int i = 0; i < 6; i++) {
			System.out.println("로또번호를 입력하세요.");
			myN[i] = scan.nextInt();
		}

		// 직접출력
		System.out.print("당첨번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", winN[i]);
		}
		System.out.println();
		System.out.print("입력번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", myN[i]);
		}
		System.out.println();
		
		//입력과 자동숫자가 맞는지 카운트
		for(int i =0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(winN[i]==myN[j]) {
					count++;
					break; // j
				}
			}
		}
		
		System.out.println("당첨개수 :" + count);
		

	}

}
