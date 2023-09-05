
public class JA0901_03 {

	public static void main(String[] args) {
//		int a = 1000000;
//		int b = 1000000;
//		long c = a * b;

		char c1 = 'a';
		System.out.println(c1);
		char c2 = 97;
		System.out.println(c2);
		char c3 = 65;
		System.out.println(c3);
		
		char c4 = (char)(c2+1);
		System.out.println(c4);
		
		char c6 = '0';
		System.out.println(c6);
		System.out.println(c6+1); //사칙연산으로 인해 "아스키코드" 숫자로 인식.
		System.out.println((char)(c6+1));
		System.out.println("------------");
	  
		int i = '4' - '0';
	    System.out.println(i);
	   
	    int i2 = 7;
	    System.out.println(i2);
	    
	    System.out.println(i-i2);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
