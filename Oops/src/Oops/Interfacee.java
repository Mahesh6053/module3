package Oops;

//interface---> it is a blue print of class
// in interface we r going explain(document) everything in a high manner we r not going to implement , if we r going to implement means we use deafault keyword for methods
// in classes the methods are default in interface the methods are in public by default if we going to default the method we use default keyword
// if you are going to implement something by default or static it will not effect all other implemented classes.
//these default and static methods are came after java 8 version
//before java 7 version we can define only unimplemented methods only
// we have to implement private method in interfaces we need java 1.9 version why we use private means in default methods and static methods inside the 
//the interface we have code duplication we need to reduce the code duplication we need to put that method in private method. 

interface Interface {

	public void copy();

	public void paste();

	public void cut();

	public void select();

	default void capture() {
		System.out.println("camera code");
	}

	static void printer() {
		System.out.println("Printing code");
	}

}

class Lenovo implements Interface {

	public void copy() {
		capture();
		System.out.println("Lenovo copy code");

	}

	public void paste() {
		System.out.println("Lenovo paste code");

	}

	public void cut() {
		System.out.println("Lenovo cut code");

	}

	public void select() {
		System.out.println("Lenovo select code");

	}

}

class hp implements Interface {
	public void copy() {
		System.out.println("hp copy code");

	}

	public void paste() {
		System.out.println("hp paste code");

	}

	public void cut() {
		System.out.println("hp cut code");

	}

	public void select() {
		System.out.println("hp select code");

	}

}

class apple implements Interface {
	public void copy() {
		System.out.println("apple copy code");

	}

	public void paste() {
		System.out.println("apple paste code");

	}

	public void cut() {
		System.out.println("apple cut code");

	}

	public void select() {
		System.out.println("apple select code");

	}
}


class Interfacee {
	public static void main(String[] mahi) {
		apple a = new apple();
		a.copy();
		a.paste();
		a.cut();
		a.select();
		
		Lenovo l=new Lenovo();
		l.copy();
		l.cut();
		l.paste();
		
		

	}
}
