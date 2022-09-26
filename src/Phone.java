
public class Phone {

	int number;
	String name;
	String model;
	double weight;

	public Phone() {

	}

	public Phone(int number, String model, String name, double weight) {
		this(number, model, name);
		this.weight = weight;
	}

	public Phone(int number, String model, String name) {
		this.number = number;
		this.model = model;
		this.name = name;
	}

	public void recieveCall(Phone phone) {
		System.out.println(phone.name + " is calling. " + phone.number);
	}

	public void getNumber() {
		System.out.println(this.number);
	}

	public void sendMessage(int... numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("the message was sent to " + numbers[i]);
		}
	}

	public void sendMessage(Phone... phones) {
		for (int i = 0; i < phones.length; i++) {
			System.out.println("the message was sent to " + phones[i].number);
		}
	}
}
