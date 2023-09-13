package p0913;



import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class J0913_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[]a = {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		int[]b = {1,2,3,4,5};
		System.out.println(Arrays.toString(b));
		String str = new String("a");
		//날짜 객체
		Date today = new Date();
		
		//format설정 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd") ; //날짜를 포맷하는 코드
		System.out.println(sdf.format(today)); //날짜
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ; //날짜를 포맷하는 코드
		System.out.println(sdf2.format(today)); //날짜
		
		//날짜 객체 Calendar 이 최신버전
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초") ;
		System.out.println(sdf3.format(cal.getTime())); 
		
		
		

	}

}
