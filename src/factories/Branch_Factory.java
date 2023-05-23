package factories;
/*
 * This is the Branch Factory which is used in the Driver class to collect the objects of Branches of Hospital namely Dublin, Maynooth and Galway.
 */
import hospital.*;
public class Branch_Factory implements Hospital_Factory {

	@Override
	public Details createStaff(String keyword,String type, String aName, int exp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BranchDetails createBranch(String city, int nof, int earnings) {
		// TODO Auto-generated method stub
		if ("Dublin".equalsIgnoreCase(city))
		{
			Dublin obj = new Dublin();
			obj.setDetails(city, nof, earnings);
			System.out.println("This is " + obj.getAddress()+" Branch and having "+obj.getNumberOfStaff()+" staff and earning "+obj.getEarnings());
			return obj;
		}
		else
		if ("Galway".equalsIgnoreCase(city))
		{
			Galway obj = new Galway();
			obj.setDetails(city, nof, earnings);
			System.out.println("This is " + obj.getAddress()+" Branch and having "+obj.getNumberOfStaff()+" staff and earning "+obj.getEarnings());
			return obj;
		}
		else 
			if ("Maynooth".equalsIgnoreCase(city))
			{
				Maynooth obj = new Maynooth();
				obj.setDetails(city, nof, earnings);
				System.out.println("This is " + obj.getAddress()+" Branch and having "+obj.getNumberOfStaff()+" staff and earning "+obj.getEarnings());
				return obj;
			}
		return null;
	}

}
