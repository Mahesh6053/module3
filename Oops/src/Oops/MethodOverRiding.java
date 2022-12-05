package Oops;

class methodoverriding1 {
	public void Addddd() {
		System.out.println("perform addition using brain");
	}

}

class add extends methodoverriding1
{
	@Override
	public void Addddd()
	{
		super.Addddd();
		System.out.println("overide method");
	}
}

public class MethodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add a = new add();
		a.Addddd();
	}

}
