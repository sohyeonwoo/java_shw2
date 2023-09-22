package p0922성적프로그램;

public class Car {

	public Car() {}
	
	public Car(String color,int door) {
		this.door = door;
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private int door;
	private String color;
}
