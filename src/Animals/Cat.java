package Animals;

public class Cat extends Animal {

	private String food = "birds";
	private String location = "flat";

	@Override
	public void makeNoise() {
		System.out.println("Meowing. Ranning like a crazy squirrel.");
	}

	public String getFood() {
		return this.food;
	}

	public String getLocation() {
		return this.location;
	}

}
