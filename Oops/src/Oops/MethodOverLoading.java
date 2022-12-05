package Oops;

class methodoverloading1
{
	//same method name but different parameters
	
	public void addd()
	{
		System.out.println("adding the numbers");
	}
	
	public void addd(int a , int b)
	{
		System.out.println(a+b);
	}
	
	public void addd(int a , int b, int c)
	{
		System.out.println(a+b+c);
	}
	
}

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading1 m = new methodoverloading1();
		m.addd();
		m.addd(10,20);
		m.addd(10,5,8);
		

	}

}
