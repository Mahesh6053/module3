package Oops;

public class PassportExampleUsingOops {

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

	public PassportExampleUsingOops(String name, String nationality, String dateofBirth, int seatnumber) {
		this.name = name;
		this.nationality = nationality;
		this.dateofBirth = dateofBirth;
		this.seatnumber = seatnumber;

	}

	public PassportExampleUsingOops(PassportExampleUsingOops source) {
		this.name = source.name;
		this.nationality = source.nationality;
		this.dateofBirth = source.dateofBirth;
		this.seatnumber = source.seatnumber;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassportExampleUsingOops air = new PassportExampleUsingOops("mahesh", "hindu", "04/07/2000", 5);
		//constructor air1 = new constructor(air);

		/*
		 * air1.setname("mahesh2"); air1.setdateofBirth("07aug22");
		 * air1.setnationality("american"); air1.setseatnumber(3);
		 */
		System.out.println("name: "+air.getname()+"\nnationality: "+air.getnationality()+"\nDOB: "+air.getdateofBirth()+"\nseatnumber:"+air.getseatnumber());
		
		
		if(air.passport()==true)
		{
			System.out.println("congratulations! "+air.getname()+" your passport application is approved");
		}
		else
			System.out.println("sorry! "+air.getname()+" your not eligible");
	}

	public  boolean passport() {
		int num = (int) (Math.random() * 2);
		
		if(num==0)
		{
			return false;
		}
		else
			return true;

	}
	
	public static void chooseSeat()
	{
		
		int randomnum=(int) (Math.random()*11);
		randomnum++;
		System.out.println(randomnum);
		
	}

}
