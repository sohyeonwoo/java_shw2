package p0908;

import java.util.Scanner;

public class J0908_01로또맞추기 {

	public static void main(String[] args) {

	
			Scanner scan = new Scanner(System.in);
			int[] lotto = new int[45];
			int[] myNumber = new int[6];
			int[] winNumber = new int [6];
			int[] myWinNo = new int[6]; //당첨된 번호
			int count = 0;
			int temp = 0;
			
			//로또번호 순차입력
			for(int i=0; i<lotto.length;i++) {
				lotto[i] = i+1; //1~45번 숫자.
			}
			//로또 섞기
			for (int i=0; i<400 ; i++) {
				int random = (int)(Math.random()*45);
				temp = lotto[0];
				lotto[0] =lotto[random];
				lotto[random]=temp;
			}
			
			//6개 로또 추출
			for(int i=0;i<6;i++) {
				winNumber[i] = lotto[i];
			}
			System.out.println();
			
			//직접입력
			for(int i=0;i<6;i++) {
				
				System.out.println("로또번호를 입력하세요.");
				myNumber[i] = scan.nextInt();
			}
			
			//직접입력
			System.out.print("당첨번호 : ");
			for (int i =0; i<6;i++) {
				System.out.printf("%d ",winNumber[i]);
			}
			System.out.println();
			System.out.print("입력번호 : ");
			for (int i =0;i<6;i++) {
				System.out.printf("%d ",myNumber[i]);
			}
			System.out.println();
			
			//입력과 자동숫자가 맞는지 카운트
			for (int i=0;i<6;i++) {
				for(int j=0;j<6;j=6) {
					if(winNumber[i]==myNumber[i]) {
						myWinNo[count]=winNumber[i];
						count++;
						break;
					}
				}
			}
			System.out.println("당첨개수" + count);

			

	}// main

}// class
