package p0913;

public class J0913_04 {

	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = 13;
//		t.minute= 13;
//		t.second = 13;
//		
		t.setHour(13);
		t.setminute(13);
		t.setsecond(13);
		System.out.printf("%d시%d분%d초 \n",t.getHour(),t.getminute(),t.getsecond());
		
		Time t2 = new Time();
		t.setHour(50);
		t.setminute(55); 
		t.setsecond(155); 
		System.out.printf("%d시%d분%d초 \n",t.getHour(),t.getminute(),t.getsecond());

	}

}
