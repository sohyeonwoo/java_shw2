package p0920;

import java.util.Arrays;

public class J0920_15 {

	public static void main(String[] args) {
		int a= -5;
		System.out.println(Math.abs(a));
		
		double b = 12.912;
				System.out.println(Math.ceil(b));
				System.out.println(Math.floor(b));
				System.out.println(Math.round(b));
System.out.println("---------------------------");
	int no1 = 10;
	int no2 = 15;
	int no3 = 13;
	System.out.println(Math.max(no1,no3));
	System.out.println(Math.min(no1, no3));
	System.out.println("----------------------");
	int iMax    = 0;
	int iMin    = 9999999;
	int[] asScores= { 10,15,13};
	 
	//최대값 구하기
	for(int i : asScores )  iMax = Math.max( i, iMax );
	 
	//최소값 구하기
	for(int i : asScores )  iMin = Math.min( i, iMin );
	 
	System.out.println( iMax );
	System.out.println( iMin );
	
	System.out.println("-------------------");

	
	System.out.println("숫자를 입력하세요.");
	
	int arr [] = {no1,no2,no3};

	
	
	}
	


	}

