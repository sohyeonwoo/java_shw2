package p0921;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

public class J0921_05 {

	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList();

		list.add(new Card(1,"Spade"));
		list.add(new Card(2,"Spade"));
		list.add(new Card(3,"Spade"));
		list.add(new Card(4,"Spade"));
		list.add(new Card(1,"Spade"));
		
		for(int i=0;i<list.size();i++) {
			
			System.out.print(list.get(i).getKind());
			System.out.println(list.get(i).getNumber());
		}
		
//		ArrayList list = new ArrayList(); //싱글스레드 지원
//		//Vector list2 = new Vector(); //멀티스레드 지원
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(1);
//		list.add(2);
//		list.add(5);
//		
//		for(int i=0; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}

	}

}
