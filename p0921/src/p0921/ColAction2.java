package p0921;

import java.util.ArrayList;

public class ColAction2 {
	Card[] card = new Card[52];
	String[] shape = {"Spaed","Diamond","Clover","Heart"};
	
	void cardAll() {
		for(int i =0;i<card.length;i++) {
			int number = i%13+1;// 1~13의 카드를 생성
			String kind = shape[i/13];
			card[i] = new Card(number,kind);
		}
			
		}
			Card[] cardInsert() {
				cardAll();
				return card;
	}
}
