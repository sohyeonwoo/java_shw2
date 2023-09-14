package p0914;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class J0914_02 {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		System.out.println(sdf.format(d));
		
//		Calendar c = new Calendar(); //에러남 
		Calendar cal = Calendar.getInstance();
		System.out.println(sdf.format(cal.getTime()));

	}

}
