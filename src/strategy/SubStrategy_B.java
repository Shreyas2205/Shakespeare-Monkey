package strategy;
/*
 *This is Concrete implementation of one of the Sub-Strategies to demonstrate the Strategy Design Patterns
 * Note this is Sub-Strategy_B which has doctor name set as "Shreyas Angchekar" and this name is defined in super class
 * Doctor_Strategy to demonstrate code re-use.
 */
import java.io.IOException;
import monkey_logic.Shakespearean_Monkey;

public class SubStrategy_B extends Doctor_Strategy{

	public void run() {
		System.out.println("This is Strategy B");
	 name = "Shreyas Angchekar";
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
    Shakespearean_Monkey SM2 = Shakespearean_Monkey.getInstance();
    System.out.println(SM2);
    SM2.shakespearean_Monkey_Runner(name, p, m);
    SM2.process();
	}
}
