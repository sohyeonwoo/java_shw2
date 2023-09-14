package p0914;

public class J0914_03 {

	public static void main(String[] args) {
		Car c;
		
		FireEngine f1 = new FireEngine();
		System.out.println("[f1 기능]");
		f1.go();
		f1.stop();
		f1.water();
		
		c=f1; //Car 형변환 생략가능
		System.out.println("[c 기능 ]");
		c.go();
		c.stop();
		//c.water(); 
		//c에는 water()공간은 있지만 c참조변수는 water()사용할수 없음
		// c.water(); 사용불가
//		a2= (Ambulance)c;
//		f2 = (FireEngine)c;
		if(c instanceof FireEngine) {
			System.out.println("[f2 기능]");
			FireEngine f2; //주소값
			f2 = (FireEngine)c;
			f2.go();
			f2.stop();
			f2.water();
		} 
		if(c instanceof Ambulance) {
			Ambulance a2;
		}
		
//			a2 = (Ambulance)c;
		//f2 = c;

	}

}
