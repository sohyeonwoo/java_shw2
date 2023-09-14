package p0914;

import java.util.ArrayList;

public class J0914_10 {

	public static void main(String[] args) {

//		Member m = new Member("aaa", "1111", "홍길동", "서울", "010-1111-1111");
//		Member m2 = new Member("bbb", "1112", "홍길서", "대전", "010-1111-1112");
//		Member m3 = new Member("ccc", "1113", "홍길남", "대구", "010-1111-1113");
//		Member m4 = new Member("ddd", "1114", "홍길북", "부산", "010-1111-1114");
//		Member m5 = new Member("eee", "1115", "홍길", "경기도", "010-1111-1115");

		// 배열 5개 입,출력
		// Array 5개 입,출력

		Member[] m = new Member[5];
		m[0] = new Member("aaa", "1112", "홍길동4", "서울1", "010-1111-1111");
		m[1] = new Member("aab", "1113", "홍길서3", "서울2", "010-1111-1112");
		m[2] = new Member("aac", "1114", "홍길남2", "서울3", "010-1111-1113");
		m[3] = new Member("aad", "1115", "홍길북1", "서울4", "010-1111-1114");
		m[4] = new Member("aae", "1116", "홍길동1", "서울5", "010-1111-1115");

		for (int i = 0; i < m.length; i++) {
			System.out.printf("%s,%s,%s,%s,%s \n", m[i].getId(), m[i].getPw(), m[i].getName(), m[i].getAddress(), m[i].getPhone());

		}

ArrayList list = new ArrayList();
		
		list.add(new Member("aaa","1111","홍길동","서울","010-1111-1111")); //Member객체는 Object객체로 자동형변환 됨.
		list.add(new Member("bbb","2222","유관순","부산","010-2222-2222"));
		list.add(new Member("ccc","3333","이순신","대구","010-3333-3333"));
		list.add(new Member("ddd","4444","강감찬","인천","010-4444-4444"));
		list.add(new Member("eee","5555","김구","광주","010-5555-5555"));
		
		for(int i=0;i<list.size();i++) {
			Member mm = (Member)list.get(i);
			System.out.printf("[%s,%s,%s,%s,%s]\n",mm.getId(),mm.getPw(),
					mm.getName(),mm.getAddress(),mm.getPhone());
		}//for

	}
}
