package p0912;

public class Deck {

	String[] shape = { "Heart", "Spade", "Diamind", "Clover" };
	Card[] c = new Card[52];

	Deck() { // 기본생성자
		for (int i = 0; i < c.length; i++) {
			//c[i] = new Card(shape[i/13],i%13+1); 아래와 같음
			c[i] = new Card();
			c[i].kind = shape[i / 13];
			c[i].number = (i % 13)+1;
//		System.out.println(c[i]);
		}
	}
	Card pick(int no) {
		if (no > 52) {
			System.out.println("숫자를 잘못 선택하셨습니다.");
			return c[no % 52];
		}
		return c[no];

	}// Deck

	Card pick() {

		int random = (int) (Math.random() * 52);
		return c[random];
	}

	void shuffle() {
		// 52 : 0~51
		Card temp;
		for (int i = 0; i < 1000; i++) {

			int random = (int) (Math.random() * 52);
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		} // for
	}// void

	void cardPrint() {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}// class
