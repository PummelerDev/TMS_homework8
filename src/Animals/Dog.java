package Animals;

public class Dog extends Animal {

	private String food = "bones";
	private String location = "street";

	@Override
	public void makeNoise() {
		System.out.println("Barking. Gnawing on the sofa.");
	}

	public String getFood() {
		return this.food;
	}

	public String getLocation() {
		return this.location;
	}

}
