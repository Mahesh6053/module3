package Oops;

class Encap {
	private String name;

	public String getname() {
		return this.name;
	}

	public void setname(String name) {
		this.name = name;
	}

}

public class Encapsulation extends Encap {
	public static void main(String[] mahi) {

		Encapsulation e= new Encapsulation();
		e.setname("mahesh");
		
		System.out.println("my name is: "+e.getname());
	}

}