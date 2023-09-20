package p0920;

public class J0920_10 {

	public static void main(String[] args) {

		String str = "swim,golf,book,run,game";
		//배열에 담아서 출력하시오
		String[] hobby = str.split(",");
		for(int i =0;i< hobby.length;i++) {
			System.out.println(hobby[i]);
		}
		String swim = hobby[0];
		String golf = hobby[1];
		String book = hobby[2];
		String run = hobby[3];
		String game = hobby[4];
		System.out.printf("%s\t%s\t%s\t%s\t%s\t",swim,golf,book,run,game);
	}

}
