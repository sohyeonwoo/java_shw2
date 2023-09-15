package p0914;

import java.util.ArrayList;

public class Buyer {

	Buyer() {
	}

	Buyer(String id, String name) {
		this.id = id;
		this.name = name;
	}

	String id;
	String name;
	int money = 10000000;
	int bonusPoint = 0;
	//Product[] cart = new Product[10];
	ArrayList list= new ArrayList(); //컬렉션 프레임워크
	
	int i=0;
	int buy(Product p) {
		//상품금액이 현재잔액보다 큰 경우
		if(money<p.price) {
			System.out.println("잔액이 부족합니다.");
			System.out.println("");
			return 0; // 구매실패
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p);
		return 1;//구매성공
//		cart[i] = p; //p를 Product[] 배열에 담음.
//		i++;
	}

}
