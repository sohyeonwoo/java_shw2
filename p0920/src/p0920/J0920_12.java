package p0920;

import java.util.Scanner;

public class J0920_12 {

	public static void main(String[] args) {

//16가1023456>>가 앞과 뒤를 랜덤숫자로 저장해서
		// 이볅 다 입력한 값과 비교해서 맞는 개수를 출력하시오.
		// ----------------------------------\\
		// 맞는갯수 파악하기
		// 26나2320411

		while (true) {

			Scanner scan = new Scanner(System.in);
			int random1 = (int) (Math.random() * 100);
			String rno1 = String.format("%02d", random1);

			int random2 = (int) (Math.random() * 10000000);
			String rno2 = String.format("%07d", random2);
			String randomNo = rno1 + "가" + rno2;

			// 번호입력
			System.out.println("복권번호를 입력하세요.");
			String input = scan.next();
			if (input.length() != 10) {
				System.out.println("번호가 잘못됐습니다.10자리 입력하세요");
				continue;// 한번만 리셋
			}
			System.out.println("입력번호 : " + input);
			System.out.println("랜덤번호 : " + randomNo);

			// 맞는 개수 몇개 맞췄는지 알아내는 코드
			int count = 0;
			for (int i = 0; i < 10; i++) {
				if (input.charAt(i) == randomNo.charAt(i)) {
					count++;
				}

			}
			System.out.println("맞는개수 : " + count);
		}

	}

}
