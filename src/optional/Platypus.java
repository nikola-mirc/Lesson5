package optional;

public class Platypus {
	private String name;

	public Platypus(String name) {
		this.name = name;
	}

	void sayHi() {
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}

	public static void main(String[] args) {

		Platypus platy = new Platypus("bobba");

		platy.sayHi();

	}
}
