package p0831;

public class JA0831_14 {

	public static void main(String[] args) {
		
		
		int a = 1000000;
				int b = 2000000;
				long c = a*b; //int*int = int 21억이 넘어가 오버플로우 발생
				System.out.println(c);
				//오버플로우 발생으로 인한 -계산이 나옴
				
				int x = 1000000;
						int y = 1000000;
						System.out.println(x*y); //long 
						
						long z = (long)x*y; //long*int,long*long = long 정상적으로 계산가능 21억 이상이 넘어갈경우
						System.out.println(z);
				
						long num = (long)a*x / y;
						System.out.println(num);
						
						long num2 = (long)a/x*y;
						System.out.println(num2);
					
						int i = 1;
						int j = 1;
						i = i + j;
						i +=j;
						
				
				
				
				
	}

}
