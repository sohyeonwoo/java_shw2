package p0907;

public class J0907_08 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		
		String str ="123";
		String str2 = "100";
		int no = Integer.parseInt(str);
		int no2 = Integer.parseInt(str2);
		
		System.out.println("문자열 더하기 : "+(str+str2));//123100
		System.out.println("정수더하기 : "+ (no+no2));//223
		
		
		
		
		
		//기본for문
		for (int i =0;i<num.length;i++) {
			System.out.println(i+"번째 방 :" +num[i]);
		}
		System.out.println( );		//단순 for문
		int  n=0;
		for(int i:num) {
			System.out.println(n+"번째 방 :" +i);
			n++;
		}//for	

	}//main

}//class
