package p0914;

import java.util.ArrayList;

public class MemberAll {

	ArrayList list = new ArrayList(); // 인스턴스 변수

	ArrayList memberRead() {

		Member m = new Member("aaa", "1111", "홍길동", "서울", "010-1111-1111");
		list.add(m);
		Member m2 = new Member("bbb", "1112", "홍길서", "대전", "010-1111-1112");
		list.add(m2);
		Member m3 = new Member("ccc", "1113", "홍길남", "대구", "010-1111-1113");
		list.add(m3);
		Member m4 = new Member("ddd", "1114", "홍길북", "부산", "010-1111-1114");
		list.add(m4);
		Member m5 = new Member("eee", "1115", "홍길", "경기도", "010-1111-1115");
		list.add(m5);

		return list;

	}
}
