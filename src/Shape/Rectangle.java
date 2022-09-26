package Shape;

public class Rectangle extends Shape {

	int x;
	int y;
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		for (int j = 0; j < y; j++) {
			for (int i = 0; i < x; i++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}
	

}
