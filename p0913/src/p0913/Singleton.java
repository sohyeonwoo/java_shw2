package p0913;

public class Singleton {
	private int hour;
	private int mainute;
	private int second;
	
	
	private Singleton() {}
	
	private static Singleton s = new Singleton();
	
	public static Singleton getInstance(){
		return s;
		
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMainute() {
		return mainute;
	}

	public void setMainute(int mainute) {
		this.mainute = mainute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}


	

}
