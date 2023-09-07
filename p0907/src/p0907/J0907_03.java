package p0907;

import java.util.Arrays;

public class J0907_03 {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 }; // 1,2,3,4,5
		int[] score = new int[5]; // 0,0,0,0,0 값이 저장되어 있음
		// score = num; 주소복사
		
		//배열복사방법 : for문 사용, 데이타값 전체를 다른 장소에 복사
//		for(int i =0;i<num.length;i++) {
//			score[i] = num[i];
//		}
		//2. 배열복사 방법 - arraycopy 메소드 사용, 데이터값 전체를 다른 장소에 복사
		
		// 첫번째 : 원본배열 두번째: 위치 세번째 : 복사대상배열 네번째 : 위치 다섯째 : 복사개수
		System.arraycopy(num,1,score,0,3);
		num[0] = 20;

		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(score));

	}// main

}// class
