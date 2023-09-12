package p0912;

public class StuScore2 {

	StuScore2(int sutNo1,String name1,int kor1,int eng1,int math1){
		this.stuNo1 = stuNo1;
		this.name1 = name1;
		this.kor1 = kor1;
		this.eng1 = eng1;
		this.math1 = math1;
		this.total1 = kor1+eng1+math1;
		this.avg1 = this.total1/3.0;
	}	
	int stuNo1 ;
	String name1;
	int kor1;
	int eng1;
	int math1;
	int total1;
	double avg1;
}
