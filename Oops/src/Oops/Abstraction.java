package Oops;

abstract class Bike {
	abstract void run();
}

class Honda extends Bike {
	public void run() {

		System.out.println("Bike is running");
	}
}

public class Abstraction {

	public static void main(String[] mahi) {

		Honda h = new Honda();
		h.run();
	}
}