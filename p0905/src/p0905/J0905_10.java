package p0905;

public class J0905_10 {

	public static void main(String[] args) {
		//구구단 for문 구현하시오.
		//2단 ~ 9단 출력하시오
		for (int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
//				if(j%2==0) {
//					continue;
//				}
				
				System.out.printf(" %d * %d = %d \n",i,j,i*j);
				
			}
			System.out.println("[     ]");
			
		}
		

		
		
		
		
//		for (int i =1; i<=10;i++) {
//			if(i%3==0) {
//				//break; // 반복문을 완전히 멈춤
//				continue; //1번만 멈춤
//			}
//			System.out.println(i);
//		}

	}

}
