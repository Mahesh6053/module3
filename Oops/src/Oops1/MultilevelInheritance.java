package Oops1;

import Oops1.Add;
import Oops1.div;
import Oops1.mul;
import Oops1.sub;

class Add {
	int a = 20, b = 10;

	void addition() {
		System.out.println("addition :" + (a + b));
	}

}

class sub extends Add {
	void subtraction() {
		System.out.println("Sub: " + (a - b));
	}
}

class mul extends sub {
	void multiplication() {
		System.out.println("mul: " + a * b);
	}
}

class div extends mul {
	void division() {
		System.out.println("div: " + a / b);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		div d = new div();
		d.addition();
		d.subtraction();
		d.multiplication();
		d.division();

	}

}
