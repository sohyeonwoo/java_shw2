package p0920;

public class J0920_03Hashcode {

	public static void main(String[] args) {

		String str =new String("샌프란시스코=연합뉴스) 김태종 특파원 = 애플의 최신 스마트폰인 아이폰15 판매 우려가 커지는 가운데 사전 주문이 호조세를 보이고 있다는 분석이 나왔다.\r\n"
				+ "\r\n"
				+ "모건스탠리는 18일(현지시간) 보고서에서 아이폰15의 리드타임(주문부터 실제 납품까지 걸리는 시간)과 사전 예약 판매가 \"우려했던 것보다 낫다\"고 밝혔다.\r\n"
				+ "\r\n"
				+ "지난 12일 공개된 아이폰15 시리즈는 15일부터 사전 주문에 들어갔다."
				);
		String str2 =new String("샌프란시스코=연합뉴스) 김태종 특파원 = 애플의 최신 스마트폰인 아이폰15 판매 우려가 커지는 가운데 사전 주문이 호조세를 보이고 있다는 분석이 나왔다.\r\n"
				+ "\r\n"
				+ "모건스탠리는 18일(현지시간) 보고서에서 아이폰15의 리드타임(주문부터 실제 납품까지 걸리는 시간)과 사전 예약 판매가 \"우려했던 것보다 낫다\"고 밝혔다.\r\n"
				+ "\r\n"
				+ "지난 12일 공개된 아이폰15 시리즈는 15일부터 사전 주문에  들어갔다."
				);
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		if(str.equals(str2)) {
			System.out.println("str,str2는 같습니다");
		}else
			System.out.println("str,str2는 다릅니다");
				
		
	}

}
