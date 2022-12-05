package Oops;

class singlelevel {
	String property = "father";

	public void fatherProperty() {
		String car = "Swift";
		String house = "Duplex";

		double cash = 300003;

		double goldWorth = 2000022;

		int lands = 3;

		System.out.println("mycar: " + car + "\nhouse: " + house + "\ncash: " + cash + "\ngoldWorth: " + goldWorth
				+ "\nlands: " + lands);

	}

}

public class SingleInheritance extends singlelevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//inheritance means: creating a new class from existing class 
		//single level means---> a child class is derived from parent class
		
		SingleInheritance s = new SingleInheritance();
		s.fatherProperty();

	}

}
