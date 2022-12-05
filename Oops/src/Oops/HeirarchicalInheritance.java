package Oops;

class Animal1 {
	void eat() {
		System.out.println("Every animal is eating");
	}
}

class rat extends Animal1 {
	void run() {
		System.out.println("cat is running");
	}
}

class cat extends Animal1 {
	
	void meow() {
		super.eat();
		System.out.println("meow meow");
	}
	
	void eat()
	{
		System.out.println("the cat eats rat");
	}
}

public class HeirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c = new cat();
		c.eat();
		c.meow();

		rat r = new rat();
		r.eat();
		r.run();

	}

}
