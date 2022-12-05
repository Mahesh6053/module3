package Oops;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddField a = new AddField("mahesh", "indian", "04/07/2000", 2);
		if (a.Boolean() == true) {
			a.setpassoprt();
		}
		/*
		 * System.out.println("name: " + a.getname() + "\n" + "nationality: " +
		 * a.getnationality() + "\n" + "dateofBirth: " + a.getdateofBirth() + "\n" +
		 * "seat number: " + a.getseatnumber());
		 * 
		 * System.out.println("passport: " + Arrays.toString(a.getpassport()));
		 */

		System.out.println(a.toString());
		
	}
}
