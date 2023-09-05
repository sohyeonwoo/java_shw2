import java.util.Scanner;

public class JA0901_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		String grade = (score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
		System.out.println("당신의 학점 : " + grade);
		
		String status = (score>=60)?"합격":"불합격";
		System.out.println("합격여부 : "  + status);
		
		
		
		
		
		
		
		
		//입력한 점수가 60점 이상이면 합격, 불합격을 출력하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요.");
//	    int score = scan.nextInt();
//	    String status = (score>=60)?"합격":"불합격";
//	    System.out.println("합격여부 : "  + status);
//	    System.out.println("입력한 점수 : " + score);
//	
	    
		
		
		
		
		//두수를 입력받아 큰수를 출력하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.print("첫번째 숫자를 입력하세요.");
//		int num1 = scan.nextInt();
//		System.out.print("두번째 숫자를 입력하세요.");
//		int num2 = scan.nextInt();
//		
//		int result = (num1 >= num2)?num1:num2;
//		System.out.printf("1번째 숫자 : %d , 2번째 숫자 : %d \n ", num1,num2);
//		System.out.print("두개의 수 중 더 큰수"+result);
		
		
		//절대값 삼항식
//		int x = -10 ;
//		int absX = (x>=0)?x:-x;
//		System.out.print("절대값 : " + absX);
//		System.out.print("입력값" + x);
		
		
		

	}

}
