package p0913;

public class Tv extends Product {
	
	int size ;
	Tv() {
		this("삼성TV70",1000000,70);
	}
	Tv(String pName,int price,int bonusPoint){
		this.pName = pName;
		this.price = price;
		this.bonusPoint = bonusPoint;
		this.size = size;
	}
	
	

}
