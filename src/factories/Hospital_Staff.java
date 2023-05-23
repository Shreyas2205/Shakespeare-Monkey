package factories;
/*
* This is the Interface used which must be defined by All Staff Members in Hospital to be a part of Hospital's Smooth Functioning
* So these methods are mandatorily over-ridden by all Staffs namely Doctor, Nurse and SupportBoy.
 */

public interface Hospital_Staff {

 public void setDetails(String aName, int experience);
 public String getName();
 public int getExperience();
 public void work();
 public void suggest();
}
