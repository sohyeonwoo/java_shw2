package p0906;

public class J00906_01 {

	public static void main(String[] args) {
		int[]num = new int [45];
		int[]random = new int [6];
//		random[0] =(int)(Math.random()*45); //0~44까지 랜덤수
//		random[1] =(int)(Math.random()*45); //0~44까지 랜덤수
//		random[3] =(int)(Math.random()*45); //0~44까지 랜덤수
//		random[4] =(int)(Math.random()*45); //0~44까지 랜덤수
//		random[5] =(int)(Math.random()*45); //0~44까지 랜덤수
//		random[6] =(int)(Math.random()*45); //0~44까지 랜덤수
		
		for(int i=0;i<6;i++) { //num[0],num[1] ....num[44]
			random[i] = (int)(Math.random()*45);
		}
//		System.out.println("랜덤 뽑기 : " + num[random1]);
//		System.out.println("랜덤 뽑기 : " + num[random2]);
//		System.out.println("랜덤 뽑기 : " + num[random3]);
//		System.out.println("랜덤 뽑기 : " + num[random4]);
//		System.out.println("랜덤 뽑기 : " + num[random5]);
//		System.out.println("랜덤 뽑기 : " + num[random6]);
		int n=0;
		for(int i=0;i<6;i++) {
			n = random[i];
			System.out.println(num[random[i]]);
			System.out.println("랜덤 뽑기 :" +num[n]);
		}
		
		
//		
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}
		

	}

}
