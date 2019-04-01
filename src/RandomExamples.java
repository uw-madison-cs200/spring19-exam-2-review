/**
 * Random
 *
 * @author Sam
 */

import java.util.Random;
import java.util.Scanner;

public class RandomExamples {

	
	public static void seedlessRandom(int i) {
		
		Random rand = new Random();
		
		System.out.print("#" + i + ": ");
		
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000));
		
		System.out.println();
	}
	
	public static void seededRandom(int i, int seed) {
		
		Random rand = new Random(seed);
		
		System.out.print("#" + i + ": ");
		
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000));
		
		System.out.println();
	}
	
	public static void lateSeededRandom(int i, int seed) {
		Random rand = new Random();
		
		System.out.print("#" + i + " after seed: ");
		
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000));
		
		rand.setSeed(seed);
		
		System.out.print(" / #" + i + " after seed: ");
		
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000));

		
		System.out.println();
	}
	
	public static void backSeededRandom(int i, int seed) {
		Random rand = new Random();
		
		System.out.print("#" + i + " after seed: ");
		
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000));
		
		rand.setSeed(seed); // set the seed
		
		System.out.print(" / #" + i + " after seed: ");
		
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000));
		
		rand.setSeed(seed); // set the seed back
		
		System.out.print(" / #" + i + " after resetting seed: ");
		
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000));

		
		System.out.println();
	}
	
	public static void setSeedVsConstructorRandom(int i, int seed) {
		Random rand = new Random(seed);
		
		System.out.print("#" + i + " after creation: ");
		
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000));
		
		rand.setSeed(seed); // set the seed
		
		System.out.print(" / #" + i + " after seed: ");
		
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000) + ",");
		System.out.print(rand.nextInt(1000));
		
		System.out.println();
	}
	
	
    public static void main(String[] args) {
    	
    	/* Comments:
    	 * - Remember to import!
    	 * - Lots of methods, but they'll be on the exam (don't need to memorize!)
    	 * - How does it actually work? 
    	 * 		- reads a sequence of "random numbers" and the sequence is determined by the seed
    	 * 
    	 * 
    	 * 
    	 */
    	
    	// ex1: random without seeds
    	System.out.println("ex1: Seedless random:");
    	for (int i = 0; i < 10; i++) {
    		seedlessRandom(i);
    	}
    	System.out.println();
    	
    	// ex2: random with seeds
    	System.out.println("ex2: Random with seed 100:");
    	int seed = 100;
    	for (int i = 0; i < 10; i++) {
    		seededRandom(i, seed);
    	}
    	System.out.println();
    	
    	// ex3: different seeds give different random sequences
    	System.out.println("ex3: Random with seed 50:");
    	seed = 50;
    	for (int i = 0; i < 10; i++) {
    		seededRandom(i, seed);
    	}
    	System.out.println();
    	
    	// ex4: setting the seed after creation
    	System.out.println("ex4: Random with seed set after creation:");
    	seed = 50;
    	for (int i = 0; i < 10; i++) {
    		lateSeededRandom(i, seed);
    	}
    	System.out.println();

    	// ex5: seed sets you at a certain spot in the random sequence 
    	System.out.println("ex5: Random with seed setting you back:");
    	seed = 50;
    	for (int i = 0; i < 10; i++) {
    		backSeededRandom(i, seed);
    	}
    	System.out.println();
    	
    	// ex6: setSeed(seed) is the same as Random(seed) 
    	System.out.println("ex6: rand.sedSeed(seed) does the same thing as setting the seed at initialization time:");
    	seed = 50;
    	for (int i = 0; i < 10; i++) {
    		setSeedVsConstructorRandom(i, seed);
    	}
    	System.out.println();
    	
    }
}
