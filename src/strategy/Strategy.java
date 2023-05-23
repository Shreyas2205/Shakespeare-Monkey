package strategy;
/*
 * This is basic Strategy class which passes the Doctor_Strategy according to the user needs.
 * Note: I have implemented 2 strategies as stated in the main class.
 * 1.  // User can use random Strategy: This is actual Hospital Scenario where Doctor is allocated as he/she is free
 * 2. // In this Strategy User demands doctor name "Shreyas" and program executes accordingly.
 * or  //In this Strategy User demands doctor name "Ruchi" and program executes accordingly
 */

public class Strategy {

	public static Doctor_Strategy getStrategy(){
		Doctor_Strategy s;
		if (Math.random()>0.5){
			s =  new SubStrategy_A();
		}
		else s = new SubStrategy_B();
		
		return s;
	}
	
	public static Doctor_Strategy setStrategy_A(){
		return new SubStrategy_A();
	}
	
	public static Doctor_Strategy setStrategy_B(){
		return new SubStrategy_B();
	}
}
