package hospital;
/*
 * This one of the concrete Implementation for Staff_Factory, this class is also used to demonstrate Singleton Design Pattern.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factories.Hospital_Staff;
import monkey_logic.Shakespearean_Monkey;;

public class Doctor extends Details implements Hospital_Staff {

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
//		suggestion = "I suggest medicine XX";
//		System.out.println("Enter the population variety: ");
//        int p = 0;
//		try {
//			p = Integer.parseInt(ob.readLine());
//		} catch (NumberFormatException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        System.out.println("Enter the rate of mutation: ");
//        float m = 0;
//		try {
//			m = Float.parseFloat(ob.readLine());
//		} catch (NumberFormatException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        Shakespearean_monkey SM3 = Shakespearean_monkey.getInstance();
//        System.out.println(SM3);
//        SM3.shakespearean_Monkey_Runner(suggestion, p, m);
//        SM3.process();
	}

	@Override
	public void suggest() {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable () {
    		public void run () {
    		        String phrase1 = "Ramesh Sharma";
    		        String phrase2 = "Shreyas Angchekar";
	
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
    		        SM.shakespearean_Monkey_Runner_Strategy(phrase1, phrase2, p, m);
    		        SM.process();
    		}
    	});
    	
    	Thread t2 = new Thread(new Runnable () {
    		public void run () {
    		        String phrase = "Raj Mithiya";
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
    	try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	t2.start();
	}


	
	

}
