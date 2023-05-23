package driver_runner;
/* JavaDoc for Driver Class:
 * This is the main class which demonstrates the complete project.
 * The first commented lines demonstrates abstract factory
 * The Second Commented Part demonstrates the Singleton Design Strategy
 * The Last Commented part demonstrates the Strategy Design Pattern
 * 
 * Note: Just to not use "new" keyword in Main class i have kept Strategy as static so that its method can be invoked with class name. 
 */
import monkey_logic.Shakespearean_Monkey;
import strategy.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factories.*;
import factory_producer.Factory_Producer;

public class Driver {
	static Doctor_Strategy s;
	
	
	
	static Doctor_Strategy randomStrategy(){
	 s = Strategy.getStrategy();
	 return s;
	}
	
	static	Doctor_Strategy userStrategy(String user){
		if ("Ruchi".equalsIgnoreCase(user))
			s= Strategy.setStrategy_A();
		if ("Shreyas".equalsIgnoreCase(user))
			s = Strategy.setStrategy_B();
		return s;
		
	}
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

}
