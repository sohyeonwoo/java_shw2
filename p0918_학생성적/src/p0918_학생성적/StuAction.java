package p0918_학생성적;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	String[] title = { "번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

	// 메인화면 출력부분
	int mainPrint() {
		System.out.println("--------------------------");
		System.out.println(" [ 학생성적 프로그램 ] ");
		System.out.println("1. 학생성적 입력");
		System.out.println("2. 학생성적 출력");
		System.out.println("3. 학생성적 수정");
		System.out.println("4. 학생성적 삭제");
		System.out.println("5. 학생성적 검색");
		System.out.println("6. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("--------------------------");
		System.out.println("원하는 번호를 입력하세요.");
		int choice = scan.nextInt();
		return choice;
	}

	// 학생메서드
	int stuInput(int stuCount) {
		while (true) {
			System.out.println();
			System.out.println("[학생성적 입력]");
			System.out.printf("%d 번째 학생 이름을 입력하세요.(0.이전페이지 이동) \n", stuCount);
			String name = scan.next();
			if (name.equals("0")) {
				System.out.println(">> 이전페이지로 이동합니다");
				System.out.println();
				break;
			}
			System.out.println("국어점수를 입력하세요.");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			int math = scan.nextInt();
			list.add(new StuScore(name,kor,eng,math));
			System.out.printf("%d 번째 학생성적이 저장되었습니다. \n",stuCount);
			System.out.println();
			stuCount++;
		}
		return stuCount;
	}

	void stuOutput() {
		System.out.println();
		System.out.println("[ 학생성적 출력 ]");
		System.out.println("-----------------------------------------------------------");
		for(int i = 0;i<list.size();i++) {
			
			System.out.printf("%s\t",title[i]);
		}
		System.out.println("%d\\t%s\\t%d\\t%d\\t%d\\t%d\\t%.2f\\t%d\\n");
		
		
	
	}

}
