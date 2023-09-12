package p0912;

public class Product {
	static int count = 1000; // 클래스 변수
	int serialNo; // 인스턴스 변수
	String pName;
	int price;
	{ //중괄호만 있는거는 초기화 블럭 //인스턴스 초기화 블럭
		serialNo = count;
		count++;
	}

	Product() { // 기본생성자

	}

	Product(String pName) {

		this.pName = pName;
	}

	Product(String pName, int price) {

		this.pName = pName;
		this.price = price;
	}
}
