package Oops;

import java.util.Arrays;

public class AddField {
	private String name;
	private String nationality;
	private String dateofBirth;
	private String[] passport;
	private int seatnumber;

	public String getname() {
		return this.name;
	}

	public String getnationality() {
		return this.nationality;
	}

	public String getdateofBirth() {
		return this.dateofBirth;
	}

	public String[] getpassport() {
		return Arrays.copyOf(this.passport, this.passport.length);
	}

	public int getseatnumber() {
		return this.seatnumber;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setnationality(String nationality) {
		this.nationality = nationality;
	}

	public void setdateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public void setpassoprt() {
		this.passport = new String[] { this.name, this.nationality, this.dateofBirth };
	}

	public void setseatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}

	public AddField(String name, String nationality, String dateofBirth, int seatnumber) {
		this.name = name;
		this.nationality = nationality;
		this.dateofBirth = dateofBirth;
		this.seatnumber = seatnumber;
		this.passport = new String[3];

	}
	
	public AddField(AddField source)
	{
		this.name = source.name;
		this.nationality = source.nationality;
		this.dateofBirth = source.dateofBirth;
		this.seatnumber = source.seatnumber;
		this.passport = Arrays.copyOf(source.passport, source.passport.length);

	}
	
	public String toString()
	{
		return "name: "+getname()+"\n"
				+"nationality: "+getnationality()+"\n"
				+"dateofBirth"+getdateofBirth()+"\n"
				+"seatnumber"+getseatnumber()+"\n"
				+"passport"+Arrays.toString(this.getpassport());
	}
	
	public boolean Boolean()
	{
		int randomnum=(int)(Math.random()*2);
		if(randomnum==0) {
			return false;
			
		}
		else {
			return true;
		}
		
	}
	
	public int random()
	{
		int random=(int) Math.random()*11;
		random++;
		return random;
	}
	

}
