package p0914;

import java.util.ArrayList;
import java.util.Scanner;

public class J0914_06 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
	    String id="";
	    String pw="";
		
		//회원정보불러오기
		MemberAll memberAll = new MemberAll();
		ArrayList list = m.memberRead();
		
		
		while(true) {
			System.out.println("아이디를 입력하세요");
			id = scan.next();
			System.out.println("비밀번호를 입력하세요");
			pw = scan.next();
			for(int i=0;i<list.size()) 
				
			
			
			
		}
		
		
		
		
		
		
		
//		
//		Buyer b1 = new Buyer();
//		int choice = 0;
//		
//		while(true) {
//			System.out.println("[가전제품 쇼핑몰]");
//			System.out.println("1. TV ");
//			System.out.println("1. 컴퓨터 ");
//			System.out.println("1. 오디오 ");
//			System.out.println("1. 세탁기 ");
//			System.out.println("-----------------");
//			System.out.println("원하는 상품 번호를 입력하세요.");
//			System.out.println("1. TV ");
//			choice = scan.nextInt();
//			
			
			
			
		}//while

	}

}
