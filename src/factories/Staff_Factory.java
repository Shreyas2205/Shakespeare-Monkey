package factories;
/*
 * This is the Staff Factory which is used in the Driver class to collect the objects of Staff of Hospital namely Doctor, Nurse and SupportBoy.
 */

import hospital.*;
public class Staff_Factory implements Hospital_Factory{

	@Override
	public Details createStaff(String keyword ,String type, String aName, int exp) {
		// TODO Auto-generated method stub
		if ("emergency".equalsIgnoreCase(keyword))
		{
			Doctor obj = new Doctor();
			obj.setDetails(aName, exp);
			System.out.println("Doctor Name: "+obj.getName()+" With experience of "+obj.getExperience()+" Years");
			return obj;
		}
		else
			if ("help".equalsIgnoreCase(keyword))
			{
				Nurse obj = new Nurse();
				obj.setDetails(aName, exp);
				System.out.println("Nurse Name: "+obj.getName()+" With experience of "+obj.getExperience()+" Years");

				return obj;
			}
			else
				if ("support".equalsIgnoreCase(keyword))
				{
					SupportBoy obj = new SupportBoy();
					obj.setDetails(aName, exp);
					System.out.println("SupportBoy Name: "+obj.getName()+" With experience of "+obj.getExperience()+" Years");
					return obj;
				}
		return null;
	}

	@Override
	public BranchDetails createBranch(String city, int nof, int earnings) {
		// TODO Auto-generated method stub
		return null;
	}
 
}
