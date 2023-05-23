package factories;
/*
 * This is the Interface used which must be defined by All branches in Hospital to be a part of Hospital's Smooth Functioning
 * So these methods are mandatorily over-ridden by all Branches namely Dublin, Maynooth and Galway. 
 */

public interface Hospital_Branches {
	public void setDetails(String city, int nos, int earnings);
	public String getAddress();
	public int getNumberOfStaff();
	public int getEarnings();
	public void displayDetailedAddress();
	

}
