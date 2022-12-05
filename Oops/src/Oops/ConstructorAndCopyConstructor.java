package Oops;

public class ConstructorAndCopyConstructor {

	// TODO Auto-generated method stub

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

	public ConstructorAndCopyConstructor(String name, String nationality, String dateofBirth, int seatnumber) {
		this.name = name;
		this.nationality = nationality;
		this.dateofBirth = dateofBirth;
		this.seatnumber = seatnumber;

	}

	public ConstructorAndCopyConstructor(Airline air, String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public ConstructorAndCopyConstructor(ConstructorAndCopyConstructor air) {
		// TODO Auto-generated constructor stu
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorAndCopyConstructor air = new ConstructorAndCopyConstructor("mahesh", "hindu", "04/07/2000", 5);
		ConstructorAndCopyConstructor air1 = new ConstructorAndCopyConstructor(air);

		air.setname("harish");
		air1.setname("mahesh2");
		air.setseatnumber(6);
		air.setnationality("canadian");
		System.out.println(air1.getname());
		System.out.println(air.getnationality());
		System.out.println(air.getdateofBirth());

		System.out.println(air.getseatnumber());

	}

}
