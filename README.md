# Project Scenario: We are considering an Hospital Environment to demonstrate the Genetic Algorithm solution to solve Infinite Monkey’s Problem. In Hospital Project there are two factories namely, 1. Branch_Factroy and 2. Staff Factory. These factories are contained in the abstract factory which is named as Hospital_Factory . In each simple factory there are object instances which are being created as and when requested by the client side. For example each instance is of the sub-class defined as follows:
## For Staff Factory there are 3 concrete implementations of Staff as
1.	Doctor.java which prints the name and experience of the doctor.
2.	Nurse.java which prints her suggestion.
3.	SupportBoy.java which prints he is available or not.
This Printing of Output is done and demonstrated with the help of Genetic Algorithm solving approach to the Shakespeare’s Monkey’s Problem.

## Similarly for Branch_Factory there are 3 concrete implementations of Branches as
1.	Maynooth.java which prints address of Maynooth hospital branch.
2.	Dublin.java which prints address of Dublin hospital branch.
3.	Galway.java which prints address of Galway hospital branch.
Again this Printing of Output is done and demonstrated with the help of Genetic Algorithm solving approach to the Shakespeare’s Monkey’s Problem.

### Packages and inside package class Description:
1. package driver_runner: this package contains the Driver.java (main() class)
	a. Driver.java: The client programmer that is user uses this class to get the ouput as desired.

2. package factories: this package keeps all the factories in it as follows
	a. Branch_Factory.java: This class is a simple factory which passes the concrete implementatiosn of branches like Dublin.java, Maynooth.java and Galway.java
	b. Staff_factory.java: This class is simple a factory which passes the concrete implemenytations of staffs like Doctor.java, Nurse.java and SupportBoy.java
	c. Hospital_Factory.java: This class is the main Abtstract_Factory which passes the instances of either Branch_Factory.java or Staff_factory.java
	d. Hospital_Branches.java: This is the interface which is implemented by all concrete branches to follow the Open-Closed Principle. 
	e. Hospital_Staff.java: This is the interface which is implemented by all concrete Staffs to follow the Open-Closed Principle. 

3. package factory_producer: this package contains the factory_producer class which takes instance of specific factory in Hospital_Factory.java which is abstract_factory
	a. Factory_Producer.java: As described in package heading, this class is used to pass the instance of either Branch_Factory.java or Staff_Fcatory.java in the parent class reference which is
				  Hospiatl_factory.java (Abstract_factory)

4. package hospital: This is package which contains all the concrete implementation of hospital project which are being used to demonstarte all the concets such as Strategy, Singleton etc.
	a. Details.java: This is super class which just defines variable so that all Concrete staff classes should extend it and uses all its variable to demonstarte code re-use.
	b. Branch_Details.java:This is super class which just defines variable so that all Concrete Branch classes should extend it and uses all its variable to demonstarte code re-use.
	c. Doctor.java : This class is concrete implementation of staff which has it own methods and prints the name of Doctor or its specifications.
	d. Nurse.java: This class is concrete implementation of staff which has it own methods and prints the name of Nurse or its specifications.
	e. SupportBoy.java: This class is concrete implementation of staff which has it own methods and prints the name of SupportBoy or its specifications.
	f. Dublim.java: This class is concrete implementation of Branch which has it own methods and prints the address of Hospital in Dublin Branch or its specifications.
	g. Maynooth.java: This class is concrete implementation of Branch which has it own methods and prints the address of Hospital in Maynooths Branch or its specifications.
	h. Galway.java: This class is concrete implementation of Branch which has it own methods and prints the address of Hospital in Galway Branch or its specifications.

5. package monkey_logic: This package contains both the classes which involves logic and processing of Genetic Algorithm.
	a. DNA.java: This is the class which is responsible for doing all GA operations such as generating population, mutation, crossover, selection etc.
	b. Shakespearean_Monkey.java: This class have the logic of solving the famous Shakespear's Infinite Monkey Problem which is described in the doc specified in this folder

6. package strategy: this packae contains all the classes which are used to demonstrate the Strategy Design pattern in the code
	a. Strategy.java: This class is very important as it perform randStrategy or passes the reference of Strategy (A or B) as specified with the help of Parent-class (Doctor_Strategy.java)
	b. Doctor_Strategy.java: This class is Parent class which is used as composition in the main class and whose behavior can be changed at run-time by the user to get specific Strategy which are its Sub-classes.
	c. SubStrategy_A.java: This class is sub-class of Doctor_Strategy which prints the Doctor's name (Ruchi Kashiwala) present in it.
	d. SubStrategy_B.java: This class is sub-class of Doctor_Strategy which prints the Doctor's name (Shreyas Angchekar) present in it.

### Running the code: 
The Following Sample  explains how to run code with comments over it explaining the stuff.

public static void main (String [] args) {
		
		/* 
		 * The following is the First Part of the code which Demonstrates Abstract_Factory Design Pattern
		 */
		Hospital_Factory branch_factory = Factory_Producer.getFactory("branch");
		Hospital_Branches galway =  (Hospital_Branches) branch_factory.createBranch("Galway", 500, 5210);
		galway.displayDetailedAddress();
		/*
		 * The Following is the Second part of the code which demonstrates Singleton Design Pattern
		 */
		Hospital_Factory staff_factory = Factory_Producer.getFactory("staff");
		Hospital_Staff doctor = (Hospital_Staff) staff_factory.createStaff("emergency", "Doctor", "Shreyas Angchekar", 12);
		doctor.suggest();
		/*
		 * The following is the Third part of the code which Demonstrates the Strategy Design Pattern
		 */
		// User can use random Strategy: This is actual Hospital Scenario where Doctor is allocated as he/she is free
		Doctor_Strategy s  = Driver.randomStrategy();
		s.run();
		// In this Strategy User demands doctor name "Shreyas" and program executes accordingly.
		Doctor_Strategy s21  = Driver.userStrategy("Shreyas");
		s21.run();
		// In this Strategy User demands doctor name "Ruchi" and program executes accordingly
		Doctor_Strategy s1  = Driver.userStrategy("Ruchi");
		s1.run();
		
			
	}