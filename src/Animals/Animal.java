package Animals;

public abstract class Animal {

	private String food;
	private String location;

	public String getFood() {
		return this.food;
	}

	public String getLocation() {
		return this.location;
	}

	public abstract void makeNoise();

	public void sleep() {
		System.out.println(getClass().getName() + ". It's sleeping.");
	}

	public void eat() {
		System.out.println(getClass().getName() + ". food: " + getFood());
	}
}
