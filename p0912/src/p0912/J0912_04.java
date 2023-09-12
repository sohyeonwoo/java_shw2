package p0912;

public class J0912_04 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "pink";
		System.out.println("c1.color : " +c1.color);
		System.out.println("c1.gearType : " +c1.gearType);
		System.out.println("c1.door : " +c1.door);
		
		
		System.out.println("======================");
		Car c2 = new Car(c1); //새로운 객체 선언으로 주소값이 다름
		System.out.println("c2.color : " + c2.color);
		c2.color = "pink";
		System.out.println("c2.color : " + c2.color);

		
		
		
	}

}
