package Oops;

class Bank {
	public int rateOfInterest() {
		System.out.println("Bank rate of interest");
		return 0;
	}
}

class Sbi
{
	public int rateOfInterest() {
		
		return 5;
	}
}

class icici
{
	public int rateOfInterest() {
		return 8;
	}
}

class Hdfc
{
	public int rateOfInterest() {
		return 9;
	}
}


public class MethodOverridingBankEx {

	public static void main(String[] args) {
		Bank b = new Bank();
		Sbi s= new Sbi();
		icici i = new icici();
		Hdfc h = new Hdfc();
		
		System.out.println(b.rateOfInterest());
		System.out.println("sbi interest rate pa is :"+s.rateOfInterest());
		System.out.println("icici interest rate pa is: "+i.rateOfInterest());
		System.out.println("hdfc interest rate pa is: "+h.rateOfInterest());

	}

}
