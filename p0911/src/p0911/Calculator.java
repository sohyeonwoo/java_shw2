package p0911;

public class Calculator {

	public static void main(String[] args) {
		Cal1 c1 = new Cal1();
		c1.value = 10;
		System.out.println(c1.value);
		Cal2 c = new Cal2();
		Cal2 c2 = new Cal2(10000);
		//c2.value =10;생략
		System.out.println(c2.value);

	}// main

}// class

class Cal1 {
	Cal1() {
	} // 기본생성자

	int value; // 인스턴스 변수 - 객체 선언후 참조변수명.변수명

}// Cal1

class Cal2 {

	int value; // 인스턴스 변수 - 객체 선언후 참조변수명.변ㄴ수명
	// 기본생성자가 안만들어짐
	Cal2(){}//기본 생성자

	Cal2(int x) { // 매개변수 1개가 있는 생성자
		value = x;
	}
}
