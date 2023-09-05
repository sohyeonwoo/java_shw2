package p0830;

public class JA0830_02 {

	public static void main(String[] args) {
	
		boolean bo = true; //논리형
		boolean bo2 = false; //논리형
		char ch = 'a';//문자형
		char ch2 = 'b';//문자형
		byte by = 1;// 정수
		short sh = 2;// 정수
		int a = 1; //정수
		int b = 20; // 정수형 단위 byte,short,int,long : int는 21억 까지
		long lo = 100L;// 롱에는 끝에 L 붙이기 //기본적으로는 정수에서 int로 받아들임 //21억 이상 단위
		float f1 = 1.2F; // 실수에서 플롯은 F를 붙이기
		double d = 11.12;//실수
		double dou = 1.2;// 실수
		System.out.println(a);
		System.out.println(b);
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);// 나누었을때 몴
		System.out.println(a % b);// 나누었을때 나머지

	}
}