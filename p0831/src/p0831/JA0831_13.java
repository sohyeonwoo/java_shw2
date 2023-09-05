package p0831;

public class JA0831_13 {

	public static void main(String[] args) {
		
		int a = 1;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		
		//System.out.println(a);
		
		int b = 10;
		int c = 10;
		b--;
		b--;
		--b;
		--b;
		--b;
		b--; 
		//System.out.println(b);
		//System.out.println(c);

		
		boolean power = true;
		System.out.println(power);
		power = !power; //on-off기능에 확용
		System.out.println(power);
		power = power;
		
		
		System.out.println(!power);
		
	    
		char ch = 'A'; //65
		char ch2 = 'a'; //97
		System.out.println(ch+ch2);
		System.out.printf("%c,%c \n",ch,ch2);
	}

}
