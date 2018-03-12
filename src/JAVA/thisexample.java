package JAVA;

public class thisexample {

	int num;
	String name;

	thisexample(int num, String name) {

		this.num = num;
		this.name = name;
	}

	void display() {
		System.out.println(num + "" + name + "");
	}

	public static void main(String[] args) {

		thisexample obj = new thisexample(111, "suresh");
		obj.display();

	}
}
