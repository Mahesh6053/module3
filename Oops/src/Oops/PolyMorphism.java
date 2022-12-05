package Oops;
class PersonGem
{
	public void gem()
	{
		System.out.println("can do maths problems");
	}
	
}

class CLang extends PersonGem
{
	public void gem() {
		System.out.println("can do c-programming");
	}
}

class java extends PersonGem
{
	public void gem()
	{
		System.out.println("can do java programming");
	}
	
}

public class PolyMorphism {

	public static void main(String[] args) {
		PersonGem pg = new PersonGem();
		CLang c= new CLang();
		java j =new java();
		
		pg.gem();
		c.gem();
		j.gem();
			
	}

}
