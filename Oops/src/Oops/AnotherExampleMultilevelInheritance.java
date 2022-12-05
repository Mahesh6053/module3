package Oops;

class animal
{
	void habits()
	{
		System.out.println("every animal has some habits: ");
	}
}

class dog extends animal
{
	void bark()
	{
		System.out.println("dog is barking");
	}
	void cute()
	{
		System.out.println("Dog is cute");
	}
}

class lion extends dog
{
	void roar()
	{
		System.out.println("lion is roaring");
	}
}

public class AnotherExampleMultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lion l=new lion();
		l.habits();
		l.bark();
		l.cute();
		l.roar();
	}

}
