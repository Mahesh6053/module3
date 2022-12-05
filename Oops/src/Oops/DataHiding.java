package Oops;

import java.util.Scanner;

public class DataHiding {

	private double balance=0;
	
	public double getbal()
	{
		return this.balance;
	}
	
	public void setbal(double bal)
	{
		this.balance=bal;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataHiding d=new DataHiding();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username: ");
		String a=sc.nextLine();
		System.out.println("Enter the password:");
		String b=sc.nextLine();
		d.setbal(35000);
		
		if(a.equals("mahesh") && b.equals("m@123"))
		{
			System.out.println(d.getbal());
		}
		sc.close();
		

	}

}
