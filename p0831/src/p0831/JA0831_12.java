package p0831;

public class JA0831_12 {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		j = ++i;
		//System.out.println(i); //6
		//System.out.println(j); //6
		
		int a = 5;
		int b = 0;
		
		b= a++;
		//System.out.println(a); //6
		//System.out.println(b); //5
		// b - a++; 대입연산자를 함께 사용하지 말 것 분리해서 사용할 것
		
		int x = 5;
		int y = 0;
		int z = 5;
		
		
		
		x++; //6
		y = x; //6
		
		
		System.out.println(x==y);
		System.out.println(x!=z); // [!] 반대라는 표시
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1==str2); //참조변수 String 은 등가비교 대상이 되지 못해 false 로 표기됨  [==같다,틀리다 표시]
                                        //8가지 기본형 타입은 등가비교 가능 		
		System.out.println(str1.equals(str2)); //   <<참조변수 비교 방법 equals
		
		

	}

}
