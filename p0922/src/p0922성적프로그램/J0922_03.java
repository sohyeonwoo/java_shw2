package p0922성적프로그램;

import java.util.ArrayList;
import java.util.HashMap;

public class J0922_03 {

	public static void main(String[] args) {
		int n1 = 1000;
		int n2 = 125;
		int a = 1;

//		String color = "white";
//		int  door = 5;

		String[] color = { "white", "red", "blue" };
		int[] door = { 5, 4, 5 };

		String[] name = { "유관순", "홍길동", "이순신" };
		int[] kor = { 100, 99, 80 };
		int[] eng = { 160, 40, 80 };
		int[] math = { 100, 100, 90 };

		JAction j = new JAction(); // 객체선언

		HashMap<String, Object> map = j.Cal(color, door, name, kor, eng, math);

		ArrayList<Car> list = (ArrayList<Car>) map.get("list");
		for (int i = 0; i < list.size(); i++)

		{
			System.out.println(list.get(i).getColor() + "," + list.get(i).getDoor());
		}
		ArrayList<StuScore> list2 = (ArrayList<StuScore>) map.get("list2");
		for (int i = 0; i < list2.size(); i++) {
			System.out.println("[" + list2.get(i).getName() + "]" + list2.get(i).getKor() + "," + list2.get(i).getEng()
					+ "," + list2.get(i).getMath());
		}

		// 매개변수 2개 > 리턴 list 타입
		/*
		 * ArrayList<Car> list = j.cal(color, door); //출력 for(int i=0;i<list.size();i++)
		 * { Car c1 = list.get(i); System.out.println(c1.getColor()+","+c1.getDoor()); }
		 */

		// n1,n2 를 JAction 으로 보내서
		// 곱한 결과값을 리턴해서 출력

		/*
		 * 매개변수 2개를 리턴 객체타입으로 받음 JAction j = new JAction(); Car c = j.cal(color, door);
		 * System.out.printf("[%s,%d]",c.getColor(),c.getDoor());
		 */
		// 매개변수 2개 > 리턴 배열타입 받음
		/*
		 * int[] result = j.cal(n1, n2); for(int i =0; i<result.length; i++) {
		 * System.out.println(result[i]); }
		 */
		// 매개변수 2개 리턴 int 타입으로 받음.
//		int result = j.cal(n1, n2, a); // 매개변수로 값을 넘겨줄수 있음
//		System.out.println("결과값 : " + result);
	}

}
