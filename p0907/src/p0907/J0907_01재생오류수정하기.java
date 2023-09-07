package p0907;

import java.util.Scanner;

public class J0907_01재생오류수정하기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 2차원 배열 ----
		int[][] num = new int[5][3];

		for (int i = 0; i < num.length; i++) {
			// [5] == num.length {
			for (int j = 0; j < num[i].length; j++) {
				// [3] == num[i].length {
				num[i][j] = (3 * i) + j + 1;
			}
		}
//2차원 배열 출력
		for (int i = 0; i < num.length; i++) {
			// [5] == num.length {
			for (int j = 0; j < num[i].length; j++) {
				// [3] == num[i].length {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}

		// 1차원 배열-----
		int[] score = new int[10];
		// score 1~10까지 숫자 입력
		for (int i = 0; i < score.length; i++) {
			score[i] = i + 1;
		}
		// 1~10까지 숫자 출력
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}

}
