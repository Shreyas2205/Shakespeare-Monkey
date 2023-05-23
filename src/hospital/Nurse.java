package hospital;
/*
 *This is one of the Concrete Implementations for Staff_Factory Demonstration which is also used to demonstrate Abstract_Factory.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factories.Hospital_Staff;
import monkey_logic.Shakespearean_Monkey;
public class Nurse extends Details implements Hospital_Staff{

	@Override
	public void setDetails(String aName, int aExperience) {
		// TODO Auto-generated method stub
		 name = aName;
		experience = aExperience;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getExperience() {
		// TODO Auto-generated method stub
		return experience;
	}
	BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));

	public void work ()
	{
		suggestion = "I will help doctor";
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
        SM3.shakespearean_Monkey_Runner(suggestion, p, m);
        SM3.process();
	}
	
	public void suggest() {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable () {
    		public void run () {
    		        String phrase1 = "Ruchi Cutie";
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
    		        Shakespearean_Monkey SM = Shakespearean_Monkey.getInstance();
    		        System.out.println(SM);
    		        SM.shakespearean_Monkey_Runner(phrase1, p, m);
    		        SM.process();
    		}
    	});
    	
    	Thread t2 = new Thread(new Runnable () {
    		public void run () {
    		        String phrase = "Ashana Mehta";
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
    		        SM2.shakespearean_Monkey_Runner(phrase, p, m);
    		        SM2.process();
    		}
    	});
    	
    	t1.start();
    	t2.start();
	}
}
