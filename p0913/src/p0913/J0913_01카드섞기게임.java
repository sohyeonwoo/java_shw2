package p0913;

public class J0913_01카드섞기게임 {

	public static void main(String[] args) {
		// 카드 52장을 생성해서 숫자와 모양을 입력하고 , 카드를 섞은 후 , 5장을 출력하시오.
		// Card , Deck , main class 3개
		// 포함관계 // 객체선언으로 구성해서 프로그램을 구현하시오.

		Deck d = new Deck();
		d.cardPrint();
		System.out.println("---------------------");
		d.shuffle();
		d.cardPrint();
		System.out.println("---------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(d.pick(i));
		}

		System.out.println("---------------------");
		Card[] a = new Card[5];
		Card[] b = new Card[5];
		System.out.println("a: 카드 5장");

//		a[0] = new Card();//객체선언 - 저장할수 있는 공간
		for (int i = 0; i < 5; i++) {
			a[i] = d.pick(i);
			System.out.println(a[i]);
		}
		System.out.println("b: 카드 5장");
		for (int i = 0; i < 5; i++) {
			b[i] = d.pick(i + 5);
			System.out.println(b[i]);

		}

	}
}
