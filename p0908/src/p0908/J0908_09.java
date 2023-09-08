package p0908;

public class J0908_09 {

	public static void main(String[] args) {
		// Spade 13 , Heart 13 , Diamond 13 , Clover 13 장
		//52장의 카드
		// 배열선언
		// Card[]
		Card[] c = new Card[52];
		String[] shape = {"Spade","Heart","Diamond","Clover"};

		for (int i = 0; i < c.length; i++) {
			c[i] = new Card(); // 객체선언
			c[i].number = (i%13) + 1;
			c[i].kind = shape[i/13]; //shape - 0~12 : Spade , 13~25 Heart , 26~38 Diamind , 39~52 Clover
		}
		System.out.println("Card num : ");
		for (int i = 0; i < c.length; i++) {

			System.out.printf("%d,%s \n", c[i].number,c[i].kind);
		}
		System.out.println();
		

		
		//배열
//		int[] num = new int[13];
//		// 1~13을 입력해 보세요
//		// for문 사용해서
//		for (int i = 0; i < 13; i++) {
//			num[i] = i + 1;
//		}
//		System.out.print("num : ");
//		for (int i = 0; i < num.length; i++) {
//			System.out.printf("%d ", num[i]);
//		}

	}

}
