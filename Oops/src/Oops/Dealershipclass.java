package Oops;

import java.util.Arrays;

public class Dealershipclass {

	private String make;
	private double price;
	private int year;
	private String color;
	private String[] parts;
	private String[] cars;
	
	
	public Dealershipclass(String make, double price, int year, String color)
	{
		this.make=make;
		this.price=price;
		this.year=year;
		this.color=color;
		this.cars=new String[3];
		this.parts=new String[3];
	}
	
	public Dealershipclass()
	{
		
		this.cars = new String[3];
	}
	
	public Dealershipclass(Dealershipclass source)
	{
		this.make=source.make;
		this.price=source.price;
		this.year=source.year;
		this.color=source.color;
		this.cars=Arrays.copyOf(this.cars, this.cars.length);
	}
	
	
	
	public void setMake(String make)
	{
		this.make=make;
		
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public void setyear(int year)
	{
		this.year=year;
	}
	
	public void setcolor(String color)
	{
		this.color=color;
	}
	
	public void setParts()
	{
		this.parts= new String[] {this.color, this.make};
	}
	
	public void setcar()
	{
		this.cars=new String[] {this.make, this.color};
	}
	
	public String getMake()
	{
		return this.make;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public String[] getParts()
	{
		return Arrays.copyOf(this.parts, this.parts.length);
	}
	
	public String[] getcars() 
	{
		return Arrays.copyOf(this.cars, this.cars.length);
    }
	
	public String toString()
	{
		return "make: "+getMake()+"\n"
				+"price: "+getPrice()+"\n"
				+"year: "+getYear()+"\n"
				+"color: "+getColor()+"\n"
				+"cars: "+Arrays.toString(getcars());
	}
	
	
}
