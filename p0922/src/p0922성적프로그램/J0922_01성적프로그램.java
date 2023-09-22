package p0922성적프로그램;

import java.util.ArrayList;

public class J0922_01성적프로그램 {

	public static void main(String[] args) {

		ArrayList<StuScore> list = new ArrayList();
		String[] title = { "번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		list.add(new StuScore("홍길동", 100, 100, 99));
		list.add(new StuScore("유관순", 100, 100, 99));
		list.add(new StuScore("이순신", 100, 180, 99));
		list.add(new StuScore("홍길동", 100, 90, 99));

		System.out.println("[성적처리 프로그램]");
		System.out.println("--------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n", title[0], title[1], title[2], title[3], title[4],
				title[5], title[6], title[7]);

		// 출력 : 번호 이름 국어 영어 수학 합계 평균 등수
		for (int i = 0; i < list.size(); i++) {
			StuScore s = list.get(i); // (StuScore)형변환 생략 가능 : 지네릭사용시
			System.out.printf("[%d\t%s\t %d\t%d\t%d\t%d\t%.2f \t%d]\n", s.getStuNum(), s.getName(), s.getKor(),
					s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
		}
	}

}
