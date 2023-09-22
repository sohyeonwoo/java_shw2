package p0922성적프로그램;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class StuMain {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		StuAction s = new StuAction();
		int choice = 0;

		// 시작시 파일 가져오기
		s.stuFOpen();
		s.stuOutput();

		loop: while (true) {

			System.out.println("--------------------------");
			System.out.println("[학생성적처리 프로그램]");
			System.out.println("--------------------------");
			System.out.println("1. 학생성적 입력");
			System.out.println("2. 학생성적 출력");
			System.out.println("3. 학생성적 수정");
			System.out.println("4. 학생성적 삭제");
			System.out.println("5. 이름순 정렬하기");
			System.out.println("6. 성적 높은순 정렬하기");
			System.out.println("7. 성적 낮은순 정렬하기");
			System.out.println("8. 파일가져오기");
			System.out.println("9. 파일저장");
			System.out.println("10. 등수처리");
			System.out.println("0. 프로그램 종료");
			System.out.println("--------------------------");
//			String strCh = JOptionPane.showInputDialog("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
//			choice = Integer.parseInt(strCh);
			switch (choice) {
			case 1:
				s.stuInput(); // 학생성적입력
				break;
			case 2:
				s.stuOutput(); // 학생성적출력
				break;
			case 3: // 학생성적 수정
				while(true) {
					System.out.println("[학생성적 수정]");
					System.out.println("수정할 학생 이름을 입력하세요(0.이전페이지 이동).");
					String inputName = scan.next();
					if(inputName.equals("0")) {
						System.out.println("이전페이지로 이동합니다");
						System.out.println();break;
					}
					System.out.println("입력된 이름으로 검색합니다.");
					// 리스트 안에 이름이 모두 있음
					int i = 0;// 검색되었을때 위치점을 저장하는 변수
					int count = 0; // 찾는 학생이 있는지 확인하는 방법
					for (i = 0; i < s.list.size(); i++) {
						StuScore st = s.list.get(i);
						if (inputName.equals(st.getName())) {
							System.out.println("입력된 이름으로 학생이 검색되었습니다");
							count = 1;
							break; // for를 빠져나오는 break
						}
					} // for
					if (count == 0) { // 검색된 이름이 없으면 실행이 됨
						System.out.println("검색된 이름의 학생이 없습니다.");
						continue; // switch를 빠져나오는 break
				}

				System.out.println("-------------------------");
				System.out.println("1. 국어점수");
				System.out.println("2. 영어점수");
				System.out.println("3. 수학점수");
				System.out.println("-------------------------");
				System.out.println("원하는 번호를 입력하세요.");
				choice = scan.nextInt();
				switch (choice) {
				case 1:
					System.out.println("[국어점수 수정]");
					System.out.println("-----------------------");
					System.out.println("현재 국어점수 : "+s.list.get(i).getKor());
					System.out.println("변경할 국어점수를 입력하세요.");
					s.list.get(i).setKor(scan.nextInt());
					s.list.get(i).setTotal(s.list.get(i).getKor()+s.list.get(i).getEng()+s.list.get(i).getMath());
					s.list.get(i).setAvg(s.list.get(i).getTotal()/3.0);
					System.out.println("-----------------------");
					System.out.println(s.list.get(i).getKor()+"점으로 국어점수가 수정되었습니다.");
					System.out.println();
					break;
				case 2:
					System.out.println("[영어점수 수정]");
					System.out.println("-----------------------");
					System.out.println("현재 영어점수 : "+s.list.get(i).getEng());
					System.out.println("변경할 국어점수를 입력하세요.");
					s.list.get(i).setEng(scan.nextInt());
					s.list.get(i).setTotal(s.list.get(i).getKor()+s.list.get(i).getEng()+s.list.get(i).getMath());
					s.list.get(i).setAvg(s.list.get(i).getTotal()/3.0);
					System.out.println("-----------------------");
					System.out.println(s.list.get(i).getEng()+"점으로 영어점수가 수정되었습니다.");
					System.out.println();
					break;
					
					
				case 3:
					System.out.println("[수학점수 수정]");
					System.out.println("-----------------------");
					System.out.println("현재 수학점수 : "+s.list.get(i).getMath());
					System.out.println("변경할 국어점수를 입력하세요.");
					s.list.get(i).setMath(scan.nextInt());
					s.list.get(i).setTotal(s.list.get(i).getKor()+s.list.get(i).getEng()+s.list.get(i).getMath());
					s.list.get(i).setAvg(s.list.get(i).getTotal()/3.0);
					System.out.println("-----------------------");
					System.out.println(s.list.get(i).getKor()+"점으로 수학점수가 수정되었습니다.");
					System.out.println();
					break;
					
				}//switch

				break;
				}//while
			case 4:
				break;

			case 5: // 이름순 정렬하기
				s.stuNameSort();
				break;
			case 6: // 성정 높은순 정렬하기
				s.stuTotalSort();
				break;
			case 7: // 성적 낮은순 정렬하기
				s.stuTotalLowSort();
				break;
			case 8: // 파일가져오기
				s.stuFOpen();
				break;
			case 9: // 파일저장
				s.stuFSave();
				break;
			case 10:

				break;
			case 0:
			
				System.out.println();
				break loop;

			} // switch
		} // while

	}// main

}// class
