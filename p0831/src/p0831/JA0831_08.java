package p0831;

public class JA0831_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		String address = "서울특별시 구로구 구로동";
				//당신의 나이는 20세 , 사는 곳은 서울특별시 구로구 구로동 입니다.
				
		System.out.println("당신의 나이는 "+age+"세,사는 곳은 "+address+"입니다.");
		System.out.printf("당신의 나이는 %d세,사는 곳은 %s입니다. \n",age,address);
		
		//국어 영어 수학 평균을 출력 소수점 2자리까지 출력하시오
		//100 100 99
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		
		kor = 100;
		eng = 100;
		math = 99;
		total = kor + eng + math;
		double avg = total/3.0;
		
		System.out.println(avg);
		System.out.printf ("평균 : %.3f \n",avg);
		 
		System.out.println("합계 : "+(kor + eng + math) );
		
		System.out.print("a");
		System.out.print("b");
		System.out.print("c"); //%04.2f (총 숫자는 4개중 소수점 뒤로는 2개)
		
		System.out.println();
		System.out.printf("%05.2f",5.8); // 05.80 으로 표시 %뒤에 있는 숫자는 전체자리수  f앞에 있는 수는 소수점 자리
		
		//연습 풀이
		System.out.println();
		System.out.println("안녕하세요 내 이름은 소현우 입니다");
		
	}

}
