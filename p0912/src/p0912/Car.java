package p0912;

public class Car {
	String color;
	String gearType;
	int door;

	Car() {
		this("white", "auto", 5);
		color = "black";
		gearType = "auto";
		door = 5;

	}
	
	Car(Car c) {
		this (c.color,c.gearType,c.door); //다른 생성자 호출
	}

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}
