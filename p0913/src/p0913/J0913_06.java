package p0913;

public class J0913_06 {

	public static void main(String[] args) {
		FireEngine f1 = new FireEngine();
		f1.water();
		f1.go();
		f1.stop();

		Ambulance a1 = new Ambulance();
		a1.go();
		a1.stop();
		a1.siren();

		// 다형성
		Car c1 = new FireEngine();
		c1.go();
		c1.stop();

		Car c2 = new Ambulance();
		c2.go();
		c2.stop();
		// c2.siren(); //자손 매소드로 인해 사용 불가

		Car c3;

		c3 = f1; // 조상의 참조변수 = 자손의 참조변수
		// c3.water(); // 공간이 있어도 조상의 참수변수로는 사용 불가

		FireEngine f2;
		f2 = (FireEngine) c3;
		System.out.println("f2 : ");
		f2.water();

		Ambulance a2;
		FireEngine f3;
		if (c3 instanceof FireEngine) {
			System.out.println("c3는 FireEngine으로 형변환 가능합니다.");
			f3 = (FireEngine)c3;
			f3.water();
		}
		if (c3 instanceof Ambulance) {
			System.out.println("c3는 Ambulance으로 형변환 가능합니다.");
			a2 = (Ambulance)c3;
			a2.siren();
		}
		
		Object o1;
		o1 = f1;
		o1= a1;
//		a2 = (Ambulance) c3; //c3에는 FireEngien 객체
//		a2.siren(); //컴파일시 에러 발생

	}

}
