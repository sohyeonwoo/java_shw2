package p0920;

public class J0920_11 {

	public static void main(String[] args) {
		String str = "Hello World";
		String input = "Hello world";
		
		if(str.equalsIgnoreCase(input)) { //대소문자 구분없이 비교
		System.out.println("str,input 같음");
		}else {
			System.out.println("str,input 다름");
		}
		
		String str2 = str.toLowerCase();
		if(str2.equals(input)) {
			System.out.println("str,input 같음");
		}else {
			System.out.println("str,input 다름");
		}

	}

}
