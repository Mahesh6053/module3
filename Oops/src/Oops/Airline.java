package Oops;

public class Airline {
	private String name = "nikki";
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

	public Airline(String name, String nationality, String dateofBirth, int seatnumber) {
		this.name = name;
		this.nationality = nationality;
		this.dateofBirth = dateofBirth;
		this.seatnumber = seatnumber;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airline air = new Airline("mahesh", "hindu", "04/07/2000", 5);

		air.setname("harish");

		air.setseatnumber(6);
		air.setnationality("canadian");

		System.out.println(air.getnationality());
		System.out.println(air.getdateofBirth());

		System.out.println(air.getseatnumber());

	}

}
