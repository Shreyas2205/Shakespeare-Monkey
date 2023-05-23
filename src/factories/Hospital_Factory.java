package factories;
/*
 * This is the main abstract factory which is the parent or super-class (interface) which is used while collecteing the specific
 * concrete type of object.
 */
import hospital.*;

public interface Hospital_Factory {
	Details createStaff (String keyword,String type, String aName, int exp);
	BranchDetails createBranch(String city, int nof, int earnings);
	
}
