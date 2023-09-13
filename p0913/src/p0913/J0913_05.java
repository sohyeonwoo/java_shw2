package p0913;

import java.util.Calendar;

public class J0913_05 {

	public static void main(String[] args) {

		Singleton s = Singleton.getInstance( );
		s.setHour(10);
		s.setMainute(0);
		s.setSecond(0);
	}

}
