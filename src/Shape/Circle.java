package Shape;

public class Circle extends Shape {
	int x;
	int y;

	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("Circle");
	}

}
