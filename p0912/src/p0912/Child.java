package p0912;

public class Child extends Parent {

	int y = 20; //인스턴스변수
	void method() { //인스턴스 메소드
		int x = 100;
		System.out.println("x : " +x);
		System.out.println("this.x : " +this.x);
		System.out.println("super.x : " + super.x);
	}
}
