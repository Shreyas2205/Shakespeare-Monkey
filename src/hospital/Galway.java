package hospital;
/*
 *  * This is one of the Concrete Implementations for Branch_Factory Demonstration which is also used to demonstrate Abstract_Factory.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factories.Hospital_Branches;
import monkey_logic.Shakespearean_Monkey;

public class Galway extends BranchDetails implements Hospital_Branches {

	@Override
	public void setDetails(String aAddress, int nos, int aEarnings) {
		// TODO Auto-generated method stub
		Address = aAddress;
		numberOfStaff = nos;
		earnings = aEarnings;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return Address;
	}

	@Override
	public int getNumberOfStaff() {
		// TODO Auto-generated method stub
		return numberOfStaff;
	}

	@Override
	public int getEarnings() {
		// TODO Auto-generated method stub
		return earnings;
	}
	@Override
	public void displayDetailedAddress() {
		// TODO Auto-generated method stub
		deatilAddress = "Galway Doc";
		String phrase1 = "Bed Available";
		String phrase2 ="Bed Not Available";
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Searching Address for you");
		System.out.println("Enter the population variety: ");
        int p = 0;
		try {
			p = Integer.parseInt(ob.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Enter the rate of mutation: ");
        float m = 0;
		try {
			m = Float.parseFloat(ob.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Shakespearean_Monkey SM3 = Shakespearean_Monkey.getInstance();
        System.out.println(SM3);
        SM3.shakespearean_Monkey_Runner_Strategy(phrase1, phrase2, p, m);
        SM3.process();
		System.out.println("The detailed Address is: "+deatilAddress);

	}
}
