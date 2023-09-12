package p0912;

public class J0912_08카드뽑기게임 {

	public static void main(String[] args) {
		
//		Card c = new Card();
//		c.kind = "Spade";
//		c.number = 1;
//		Card c2 = new Card();
//		c2.kind = "Spade";
//		c2.number = 2;
		
//		System.out.println(c);
//		System.out.println(c2);
		
		//12장을 Spade 1~13장
		
		//J - 11, Q - 12 , K - 13
		
		Deck d = new Deck();
		d.cardPrint();
		d.shuffle();
		System.out.println("---------------");
		d.cardPrint();
		System.out.println("---------------");
		System.out.println("카드 한장 출력 : ");
		System.out.println(d.pick(3));
		System.out.println("---------------");
		System.out.println(d.pick());

	}

}
