package Oops;

public class constructor {

	// TODO Auto-generated method stub

	private String name;
	private String nationality;
	private String dateofBirth;
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

	public void setseatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}

	public constructor(String name, String nationality, String dateofBirth, int seatnumber) {
		this.name = name;
		this.nationality = nationality;
		this.dateofBirth = dateofBirth;
		this.seatnumber = seatnumber;

	}

	

	public constructor(constructor air) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor air = new constructor("mahesh", "hindu", "04/07/2000", 5);
		constructor air1 = new constructor(air);

		air1.setname("mahesh2");
		air1.setdateofBirth("07aug22");
		air1.setnationality("american");
		air1.setseatnumber(3);
		
		System.out.println("original constructor values are: ");
		System.out.println(air.getname());
		System.out.println(air.getnationality());
		System.out.println(air.getdateofBirth());
		System.out.println(air.getseatnumber()+"\n");
		System.out.println("copied constructor values are:");
		System.out.println("\t"+air1.getname());
		System.out.println("\t"+air1.getnationality());
		System.out.println("\t"+air1.getdateofBirth());

		System.out.println("\tseat num: "+air1.getseatnumber());

	}



}
