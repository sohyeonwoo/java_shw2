package p0919;

public class KorPerson {

	KorPerson() {
	}

	KorPerson(String JuminNo, String name) {

		this.JuminNo = JuminNo;
		this.name = name;
	}

	String JuminNo;
	String name;

	public boolean equals(Object obj) {
		boolean temp = false;
		KorPerson k = (KorPerson) obj;
		if (k.JuminNo.equals(k.JuminNo)) {
			temp = true;
		} else {
			temp = false;
		}

		return temp;
	}
	public String toString() {
		return String.format("[%s,%s]",JuminNo,name);
	}

}// class
