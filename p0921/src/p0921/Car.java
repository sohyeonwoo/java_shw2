package p0921;

public class Car {
	Car() {
	}

	private String color;
	private int door;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public Car(String color, int door) {
		super();
		this.color = color;
		this.door = door;
	}

//	Car(String color,int door){
//		this.color = color;
//		this.door = door;
//	}
	public String toString() {
		return super.toString();
	}
}
