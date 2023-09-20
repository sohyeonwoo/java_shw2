package p0920;

public class J0920_08 {

	public static void main(String[] args) {

	 String str =" " ;
	 int result =-1;
	 int count = 0;
	 while(true) {
		result = str.indexOf("아이폰15",result+1);
		if(result==-1) break;
		count++;
	 }
	 System.out.println("개수 : " + count);
	 
	}

}
