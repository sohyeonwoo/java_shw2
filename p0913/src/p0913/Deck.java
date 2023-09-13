package p0913;

import p0913.Card;

public class Deck {

	String[] shape = { "Diamond", "Heart", "Spade", "Clover" };
	Card[] c = new Card[52];

	Deck() {
		for (int i = 0; i < c.length; i++) {
			c[i] = new Card();
			c[i].kind = shape[i / 13];
			c[i].number = i % 13 + 1;
		}
	}

	Card pick(int nu) {
		if (nu > 52) {
			return c[nu % 52];
		}
		return c[nu];

	}// Deck

	Card pick() {

		int random = (int) (Math.random() * 52);
		return c[random];
	}

	void shuffle() {
		Card temp;
		for (int i = 0; i < 400; i++) {
			int random = (int) (Math.random() * 52);
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
	}

//출력매소드
	void cardPrint() {
		for (int i = 0; i < 52; i++) {
			System.out.println(c[i]);

		}
	}
}
