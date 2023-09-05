import java.util.Scanner;

public class JA0901_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학번을 입력하세요.");
		int number = scan.nextInt(); //enter key값은 입력 받지 않음
		scan.nextLine();
		
		
		System.out.println("이름을 입력하세요.");
		//String name = scan.next(); //문장만 입력가능 , 사이 띄우기 안됨
		String name = scan.nextLine(); // enter key 누르기 전까지 입력이 가능
		System.out.println("이름 : " +name);
		
		System.out.println("국어점수를 입력하세요.");
		String k = scan.nextLine(); // nextLine 문자열을 입력받는 명령어
		int kor = Integer.parseInt(k); //String 을 int 타입으로 변경 -> int8가지 기본형 타입이면 형태변화
		System.out.println("영어점수를 입력하세요.");
		String e = scan.nextLine();
		int eng = Integer.parseInt(e); //String 을 int 타입으로 변경 -> int8가지 기본형 타입이면 형태변화
		System.out.println("합계 : "+(kor+eng));
		
		
		

	}

}
