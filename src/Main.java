import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Horse;
import Animals.Veterinarian;
import Clinic.Patient;
import Shape.Circle;
import Shape.Rectangle;
import Shape.Shape;

public class Main {

	public static void main(String[] args) {
		Phone a = new Phone(2233254, "Samsung", "Jack");
		Phone b = new Phone(4564566, "Samsung", "Bill");
		Phone c = new Phone(7867889, "Samsung", "John");

		a.recieveCall(b);
		a.getNumber();
		b.recieveCall(c);
		b.getNumber();
		c.recieveCall(a);
		c.getNumber();

		a.sendMessage(134343, 1432314213, 23434, 234234, 234234);
		a.sendMessage(b, c);

		Patient patient1 = new Patient("Jack", 1);
		Patient patient2 = new Patient("John", 2);
		Patient patient3 = new Patient("Calvin", 3);
		Patient patient4 = new Patient("Andrew", 4);

		Dog bobik = new Dog();
		Cat murzik = new Cat();
		Horse tsygan = new Horse();
		Veterinarian aibolit = new Veterinarian();

		murzik.makeNoise();
		murzik.eat();
		murzik.sleep();

		aibolit.treatAnimal(murzik);
		aibolit.treatAnimal(tsygan);
		aibolit.treatAnimal(bobik);

		Animal[] animals = { murzik, bobik, tsygan };

		Rectangle rectangle = new Rectangle(10, 5);
		Circle circle = new Circle(5, 5);
		Shape[] shapes = { rectangle, circle };
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].draw();
		}
	}

}
