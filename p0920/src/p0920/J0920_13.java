package p0920;

public class J0920_13 {

	public static void main(String[] args) {
		int no = 0;
		for (int i = 0; i < 10; i++) {
			no += i;
		}
		System.out.println(no);

		// 2.String객체 반복 - 반복횟수만큼 메모리공간 사용 (속도느림)
		String str = "aaa";
		for (int i = 0; i < 10; i++) {
			str += "" + i;
		}
		System.out.println(str);

		// 3. StringBuffer 객체 반복 - 1개 메모리 공간 사용 (속도빠름)
		StringBuffer sb = new StringBuffer("aaa");
		// StringBuffer s = "aaa" //사용불가 같은 String 타입이라도 객체선언 후 사용하기.
		for (int i = 0; i < 10; i++) {
			sb.append(i); // 문자를 추가 - addpend 사용해야함
		}
		System.out.println(sb);
		
		// 4.StringBuffer 비교 - equals() 정의되어 있지 않음.
		StringBuffer sb1 = new StringBuffer("aaa");
		StringBuffer sb2 = new StringBuffer("aaa");
		if(sb1.equals(sb2)) {
			System.out.println("sb1,sb2는 같음");
		}else {
			System.out.println("sb1,sb2는 다름");
		}
		//String 비교 = equals()가 정의되어 있음.
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		if(s1.equals(s2)) {
			System.out.println("sb1,sb2는 같음"); //SrtingBuffer객체를 변환해서 사용해야 함.
		}else {
			System.out.println("sb1,sb2는 다름");
		}
	}

}
