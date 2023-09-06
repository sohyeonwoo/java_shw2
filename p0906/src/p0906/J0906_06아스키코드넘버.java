package p0906;

public class J0906_06아스키코드넘버 {

	public static void main(String[] args) {
		char ch = '0';
		char ch1 = '2';
		System.out.println(ch1-'0');
		System.out.println("'2'아스키코드 : " +(int)ch1); //아스키코드 : 50
		System.out.println("'0'아스키코드 : " +(int)ch); //아스키코드 : 48
		System.out.println("-----------------");
		
		char ch2 = 'A'; //아스키코드 : 65
		System.out.println((char)(ch2+32));
		
		char ch3 = 'a'; //아스키코드 : 97
				System.out.println((char)(ch3-32));
	}

}
