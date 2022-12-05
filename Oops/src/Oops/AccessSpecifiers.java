package Oops;

public class AccessSpecifiers {

	String name;
	private int year=0;
	protected String country;

	// anywhere in the package

	public void details() {
		System.out.println("enter name1");
	}

	// with in the class only

	private static void detail() {
		System.out.println("enter year-20222");
	}

	
	//with in the package and outside package only for childs(protected=default+childs)
	
	protected void det() {
		System.out.println("enter country");
	}
	public void main()
	{
		System.out.println(year);
		detail();
	}
	
	

}
