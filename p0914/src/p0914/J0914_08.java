package p0914;

import java.util.ArrayList;

public class J0914_08 {

	public static void main(String[] args) {
		//1.배열크기제한
		//2.같은 타입만 가능
		//3,삭제불가
		//4.추가기재 불가능
		
		Card[] c = new Card[4];
		c[0] = new Card("Spade",1);
		c[1] = new Card("Heart",1);
		c[2] = new Card("Diamind",1);
		c[3] = new Card("Clover",1);
		
		for(int i=0;i<c.length;i++) {
			System.out.printf("[%s,%d]\n",c[i].kind,c[i].number);
		}
		
		
		System.out.println("--------------------------");
		//1.배열의 크기제한이 없음
		//2.타입자유
		//3.삭제가능
		//4.추가기재 가능
		ArrayList list = new ArrayList();
		list.add(new Card("Spade",1));
		list.add(new Card("Heart",1));
		list.add(new Card("Diamind",1));
		list.add(new Card("Clover",4));
		list.add(new Card("Clover",2));
		list.add(new Card("Clover",3));
		
		for(int i =0; i<list.size();i++) {
			Card ca= (Card)list.get(i);
			System.out.printf("[%s,%d]",ca.kind,ca.number);
		}

	}

}
