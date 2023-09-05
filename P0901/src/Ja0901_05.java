
public class Ja0901_05 {

	public static void main(String[] args) {
//		int num = 12345;
//		int result = 12345*1000/1000;
//		System.out.println(result);
//		
		
		
		
		double pi = 3.141592;
		double shortPi = (int)(pi*1000)/1000.0;
		System.out.println("pi : "+pi);
		System.out.println("shortPi : "+shortPi);
		
		//소수점 4자리 이하 절사하시오
		
		
		double d = 124.15235678;
		double shortd = (int)(d*10000)/10000.0;
		System.out.println("d : "+d);
		System.out.println("shortd : "+shortd);
		
		double d2 = 2563.12121245;
		double shortd2 = (int)(d2*100)/100.0;
		System.out.println("d2 : "+d2);
		System.out.println("shortd2 : "+shortd2);
		
		
		System.out.println("-------------------------");
		
		
		
		//Math.round()-반올림 , Math.ceil()-올림, Math.Fioor()-버림
		//소수점 첫째 자리에서 반올림,올림,내림 결정
		double n = 12.598;
		double n2 = 2.321;
		
		System.out.println(Math.round(n)); //소수점 첫째자리 에서 반올림
		System.out.println(Math.ceil(n)); //소수점 첫째자리 에서 올림
		System.out.println(Math.floor(n));//소수점 첫째자리 에서 버림
		System.out.println(Math.ceil(n2));
		
		// 소수점 둘째자리 반올림.
		
		//double n3 = (int)(n*100)/100.0;
		double n3 = Math.round(n*10)/10.0;
		System.out.println("둘째자리 반올림 :" + n3);
		
		// 소수점 네번째 반올림
		//double x = 156.7854294;
		double x = 156.7854294;
		double x2 = Math.round(x*1000)/1000.0;
		System.out.println("네번째자리에서 반올림" + x2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
