package p0831;

public class JA0831_06 {

	public static void main(String[] args) {
		int x = 2147483647;
		int total = 0;
		total = x + 5;
		
		
		System.out.println(total); //오버플로우 : 최대치의 숫자를 넘어간 경우 다시 [-]부터 시작
		
		int a = 1000000;
		int b = 1000000;
		System.out.println(a+b); //2000000
		System.out.println(a*b); //-727379968
		 // int : 21억 이라는 숫자를 오버페이스 해서 계산하게 되면 [-]로 산정됨 
		
		long c = 1000000L;
		int d = 10000000;
		System.out.println(a+b); 
		System.out.println(a*b); 
		//21억 초과해서 long으로 변경
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
