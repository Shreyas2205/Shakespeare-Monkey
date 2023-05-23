package monkey_logic;
/*
 * This is actual logic solving class for Shakespearean Monkey's Problem which demonstrates Singleton Design Pattern(getInstance()) 
 * also as it uses Synchronized keyword and Double Checked Locking to show that it is safely Singleton even in Multi-Thread Environment.
 */

import java.util.ArrayList;

 public class Shakespearean_Monkey
{
	 public static Shakespearean_Monkey obj;
	private Shakespearean_Monkey (){
		System.out.println("Instance Created for the first time");
	} 
	
	public static Shakespearean_Monkey getInstance() {
		//Singleton Pattern
		/*
		 * The following is Double Checked Locking algorithm using keyword synchronized to make sure that it follows Singleton
		 * Design Pattern even in Multi-Threaded Environment.s
		 */
		if (obj == null)
		{
			synchronized (Shakespearean_Monkey.class) {
				if (obj == null)
					obj = new Shakespearean_Monkey();
			}
		}
		return obj;
	}
    private DNA population[];//The DNA of the population
    private String target;//The target string that is to be achieved
    int targetLength;
    private ArrayList<DNA> matingPool;//The mating pool for each generation
    private float mutationRate;
    private int generation = 1;
    public void shakespearean_Monkey_Runner(String s, int p, float m)//target and DNA is initialized
    {
        population=new DNA[p];
        target=s;
        targetLength=target.length();
        mutationRate=m;
        for(int i=0;i<population.length;i++)
            population[i]=new DNA(targetLength);
        System.out.println("Mutation Rate : " +mutationRate * 100);
        System.out.println("Population = : " + p);

    }
    
    
    public void shakespearean_Monkey_Runner_Strategy(String s, String s2,int p, float m)//target and DNA is initialized
    {
        population=new DNA[p];
        if (Math.random()>0.5) {
        	target=s;
        }
        else
        {
        target=s2;
        }
        targetLength=target.length();
        mutationRate=m;
        for(int i=0;i<population.length;i++)
            population[i]=new DNA(targetLength);
        System.out.println("Mutation Rate : " +mutationRate * 100);
        System.out.println("Population = : " + p);

    }
    

    public void process()
    {
        while(true)
        {
            //SELECTION

            //Assigning the fitness value to each member of the population
            for(int i=0;i<population.length;i++)
                population[i].fitness(target);

            ArrayList<DNA> matingPool=new ArrayList<DNA>();//initializing the mating pool as an empty ArrayList
            //Populating the mating pool depending on the fitness of each DNA
            for(int i=0;i<population.length;i++)
            {
                int n=(int)(population[i].fitness*100);//fitness percentage of the mating pool
                for(int j=0;j<n;j++)//adding the particular DNA to the mating pool n times
                    matingPool.add(population[i]);
            }

            //REPRODUCTION
            DNA child=new DNA(targetLength);
            for(int i=0;i<population.length;i++)
            {
                //choosing two random indices from the matingPool ArrayList
                int a=(int)(Math.random()*(matingPool.size()-1));
                int b=(int)(Math.random()*(matingPool.size()-1));

                //selecting two parents
                DNA parentA=matingPool.get(a);
                DNA parentB=matingPool.get(b);

                child=parentA.crossover(parentB);
                child.mutate(mutationRate);
                population[i]=child;
            }

            System.out.println("Generation: "+ generation + " " + child.getPhrase());
            generation ++;
            if(target.equals(child.getPhrase())) {
            		
            	System.out.println("Generation of Solution: " + (generation-1));
            	System.out.println(target);

                break;	
            }
        }
    }

}