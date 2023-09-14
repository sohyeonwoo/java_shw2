package p0914;

import java.util.ArrayList;
import java.util.Scanner;

public class J0914_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id = "";
		String pw = "";

		ArrayList list = new ArrayList();
		Member m = new Member("aaa", "1111", "홍길동", "서울", "010-1111-1111");
		list.add(m); //Member객체는 => Object 객체로 자동변환 됨.
		Member m2 = new Member("bbb", "1112", "홍길서", "대전", "010-1111-1112");
		list.add(m2);
		Member m3 = new Member("ccc", "1113", "홍길남", "대구", "010-1111-1113");
		list.add(m3);
		Member m4 = new Member("ddd", "1114", "홍길북", "부산", "010-1111-1114");
		list.add(m4);
		Member m5 = new Member("eee", "1115", "홍길", "경기도", "010-1111-1115");
		list.add(m5);

		System.out.println("아이디를 입력하세요.");
		id = scan.next();
		System.out.println("비밀번호를 입력하세요.");
		pw = scan.next();
		
		Member TempM = (Member)list.get(0);
		String tempId = TempM.getId();
		String tempPw = TempM.getPw();
		
		if(id.equals(tempId)) {
			if(pw.equals(tempPw)) {
				System.out.println("로그인이 되었습니다.");
			}
		}
		
		
		
		
		
	}

}
