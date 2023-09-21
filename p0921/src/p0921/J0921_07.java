package p0921;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class J0921_07 {

	public static void main(String[] args) {
		// list 순서 있음 , 중복 있음.

		//Map 데이터를 키와 값의 쌍으로 저장
		// set : 순서 없음, 중복 안됨
		HashSet<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println();
		}
		System.out.println();

		Iterator<String> it2 = set.iterator();
		while (it2.hasNext()) {
			System.out.println();
		}
		System.out.println("완료!");

//		ArrayList list = new ArrayList();
//		list.add(0);
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(6);
//		list.add(7);
//		list.add(8);
//		list.add(9);
//		list.add(10);

		// Interator 최신버전 - iterator(),hasNext(),next
//		Iterator<String> it = list.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//
//		Vector<Integer> v = new Vector();
//		v.add(1);
//		v.add(2);
//		v.add(3);
//		v.add(4);
//		v.add(5);
//		// Interator 구버전
//		Enumeration<Integer> e = v.elements();
//		while (e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}

//		for(int i =0; i<list.size();i++) {
//			//list.remove(5);
//			System.out.println(list.get(i));
//			
//		}
//		System.out.println("-----------");
//	

	}// main
}// class
