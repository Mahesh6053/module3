package Oops;

import java.util.Arrays;

public class DealerShipMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] parts= {"tires", "keys"};
		
		Dealershipclass Benz= new Dealershipclass("Benz",5000.000, 2022, "White");
		
		Dealershipclass Swift=new Dealershipclass("swift", 3000,2020, "blue");
		
		Dealershipclass ferrari = new Dealershipclass("ferrari",6000,2021,"yellow");
		
		System.out.println(Benz.toString()+"\n");
		System.out.println(Swift.toString()+"\n");
		System.out.println(ferrari.toString()+"\n");
		
		System.out.println(Arrays.toString(parts));
		
	};

}
