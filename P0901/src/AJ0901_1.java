import java.util.Scanner;

public class AJ0901_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = 0; // 정수형타입을 생성해서 0의 값을 입력
		String name = ""; // String 문자열 타입을 생성해서 0의 값을 입력
		int kor = 0; // 국어 점수를 입력할수 있는 변수선언
		int eng = 0; // 영어 점수를 입력할수 있는 변수선언
		int math = 0; // 수학 점수를 입력할수 있는 변수선언
		int total = 0; // 합계점수를 입력할수 있는 변수선언
		double avg = 0; // 실수형 타입을 생성해서 0의 값을 입력

		// 키보드 입력을 통한 값 입력

		System.out.println("학번을 입력하세요.");
		number = scan.nextInt(); // 숫자입력으로 인해 Next 다음에 int 붙이기
		System.out.println("이름을 입력하세요.");
		name = scan.next(); // 문자입력은 Int 제외하고 적기
		System.out.println("국어점수를 입력하세요.");
		kor = scan.nextInt();// 숫자입력으로 인해 Next 다음에 int 붙이기
		System.out.println("영어점수를 입력하세요.");
		eng = scan.nextInt();// 숫자입력으로 인해 Next 다음에 int 붙이기
		System.out.println("수학점수를 입력하세요.");
		math = scan.nextInt();// 숫자입력으로 인해 Next 다음에 int 붙이기
//      데이터 값 직접입력
//		number = 1;
//		name = "홍길동";
//		kor = 100;
//		eng = 100;
//		math = 100;
		total = kor + eng + math;
		avg = total / 3.0;

		System.out.println("[학생성적프로그램]");
		System.out.println("---------------");
		System.out.println("번호 : " + number);
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + total);
		System.out.printf("평균 : %.2f \n", avg); // printf로 바꿔서 소수점 두자리까지 출력하는 방법

		// 연습시작
		int number1 = 0; // 정수형타입을 생성해서 0의 값을 입력
		String name1 = ""; // String 문자열 타입을 생성해서 0의 값을 입력
		int kor1 = 0; // 국어 점수를 입력할수 있는 변수선언
		int eng1 = 0; // 영어 점수를 입력할수 있는 변수선언
		int math1 = 0; // 수학 점수를 입력할수 있는 변수선언
		int total1 = 0; // 합계점수를 입력할수 있는 변수선언
		double avg1 = 0; // 실수형 타입을 생성해서 0의 값을 입력

		// 키보드 입력을 통한 값 입력

		System.out.println("학번을 입력하세요.");
		number1 = scan.nextInt(); // 숫자입력으로 인해 Next 다음에 int 붙이기
		System.out.println("이름을 입력하세요.");
		name1 = scan.next(); // 문자입력은 Int 제외하고 적기
		System.out.println("국어점수를 입력하세요.");
		kor1 = scan.nextInt();// 숫자입력으로 인해 Next 다음에 int 붙이기
		System.out.println("영어점수를 입력하세요.");
		eng1 = scan.nextInt();// 숫자입력으로 인해 Next 다음에 int 붙이기
		System.out.println("수학점수를 입력하세요.");
		math1 = scan.nextInt();// 숫자입력으로 인해 Next 다음에 int 붙이기
//      데이터 값 직접입력
//		number = 1;
//		name = "홍길동";
//		kor = 100;
//		eng = 100;
//		math = 100;
		total1 = kor1 + eng1 + math1;
		avg1 = total1 / 3.0;

		System.out.println("[학생성적프로그램]");
		System.out.println("---------------");
		System.out.printf("번호 : %d \t", number1);
		System.out.printf("이름 : %s \t", name1);
		System.out.printf("국어 : %d \t", kor1);
		System.out.printf("영어 : %d \t", eng1);
		System.out.printf("수학 : %d \t", math1);
		System.out.printf("합계 : %d \t", total1);
		System.out.printf("평균 : %.2f \n", avg1); // printf로 바꿔서 소수점 두자리까지 출력하는 방법
		
		
		
		
		
		
		
		

	}

}
