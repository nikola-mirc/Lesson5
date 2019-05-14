package exercises;

public class Runner {

	public static void main(String[] args) {

		Smurf handy = new Smurf("Handy");
		System.out.println(handy.getName() + " " + handy.getHatColor("red") + " " + handy.isGirlOrBoy());

		Smurf papa = new Smurf("Papa");
		System.out.println(papa.getName() + " " + papa.getHatColor("red") + " " + papa.isGirlOrBoy());

		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(smurfette.getName() + " " + smurfette.getHatColor("white") + " " + smurfette.isGirlOrBoy());

	}

}
