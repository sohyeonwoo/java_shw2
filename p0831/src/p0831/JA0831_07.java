package p0831;

public class JA0831_07 {

	public static void main(String[] args) {
		double d = 1.6;
		int i = (int)d; //정수부분만 입력됨  double 넣어도 정수부분만 입력됨
		System.out.println(i);
		
		// 소수점 표기하고 싶을시 ex : 밑에 참고
		
		int x=10;
		double d2 = x; 
		System.out.println(d2); //int는 정수여서 소수점이 안나오지만 더블을 넣어 소수점 전환 단, 소수점은 .0 한자리만 기재됨
		
		//크기순서 : char >(byte > short) > int > long > float > double > String
	    //byte , short 는 사용안함 생략가능
		
		System.out.println(10/3.0);
	
		System.out.printf("%.2f \n",10/3.0);  //printf 에서 [\n]은 줄바꿈 [\t]는 사이를 띄어줌
		//실수형값 %f 를 쓰고 정수형값 %d  문자열값 %s (Sting) %c (char) 문자로 출력
		System.out.println("안녕하세요.");
		System.out.printf("%s \n", "홍길동입니다.");
		System.out.printf("%,010d",100000000);
		
		System.out.printf("국어 : %d, 영어 : %d \n" , 100,99);
	

	}

}
