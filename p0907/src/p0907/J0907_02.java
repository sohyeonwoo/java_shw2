package p0907;

import java.util.Scanner;

public class J0907_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// score [5] [5] 1~25까지 숫자를 입력
		// 2차원 형태로 출력하시오

		// 1차원 배열 temp 1~25까지 숫자를 입력하시오

		// 입력
		int[][] num = new int[5][5];
		int[] temp = new int[25];
		int n = 0;
		int number = 0;

		// 1차원 배열 입력
		for (int i = 0; i < 25; i++) {
			temp[i] = i + 1;
		}

		// 번호 섞기
		for (int i = 0; i < 400; i++) {
			int random = (int) (Math.random() * 25);
			n = temp[0];
			temp[0] = temp[random];
			temp[random] = n;
		}

		// 출력
		for (int i = 0; i < 25; i++) {

			System.out.print(temp[i] + "");
		}
		System.out.println();

		// 2차원배열에 temp 배열을 입력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				// num[i][j] = (5 * i) + j + 1;
				num[i][j] = temp[(5 * i) + j];
			}
		}
		//무한 반복
		while(true) {
			
		// 2차원 출력
		System.out.println("              [숫자맞추기 게임]");
		System.out.printf(" |\t0\t1\t2\t3\t4\n");
		System.out.println("------------------------------------------------");
		for (int i = 0; i < num.length; i++) {
			System.out.print(i + "|\t");

			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i =0;i<5;i++) {
			for ( int j=0;j<5;j++) { 
				if (num[i][j]==number) {
					num[i][j] = 0;
					
				}

				
			}
			break;
		}
//		System.out.println("원하는 숫자를 입력하세요.");
//		System.out.println("좌표를 입력하세요.(열)");
//		int input2 = scan.nextInt();
//		//좌표 위치값을 "0"으로 변경
//		num[input][input2] = 0;
		
		}
		
	}// main

}// class
