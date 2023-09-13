package p0913;

public class Card  {

	Card(){} //기본생성자
	
	Card(String kind , int number){
		this.kind = kind;
		this.number = number;
	}
	final int NUMBER_MAX = 13;
	
	int number;
	private int flag;
	String kind;
	String[] CardShape = {"0","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public String toString() {
		return String.format("[%s,%s]",kind,CardShape[number]);
		
	}
	
}
