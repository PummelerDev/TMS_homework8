package Animals;

public class Horse extends Animal {

	private String food = "grass";
	private String location = "field";

	@Override
	public void makeNoise() {
		System.out.println("Neighing. Rearing up.");
	}

	public String getFood() {
		return this.food;
	}

	public String getLocation() {
		return this.location;
	}

}
