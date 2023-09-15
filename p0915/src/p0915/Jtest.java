package p0915;

import java.util.Scanner;

public class Jtest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int stuCount = 1;
		
		//while 무한반복 시작
		while(true) {
			int choice = stuAction.mainPrint();
			switch (choice) {
			case 1://학생입력
				//학생 메소드
				stuCount = stuAction.stuInput(stuCount);
				break;
			case 2:
				stuAction.stuOutput();
			case 3:
			}
		}

	}

}
