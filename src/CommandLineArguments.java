/**
 * Command line arguments
 * 
 * @author Sam
 **/
public class CommandLineArguments {

	/*
	 * 0) Motivation: a) sometimes you want to run the same code with different
	 * parameters (code length for Mastermind) -- rather than having it be in a file
	 * you have to change, just give it as INPUT to the program! That way you can
	 * run the EXACT SAME CODE with different parameters 
	 * 
	 * 1) how to GIVE them as input: 
	 * 	a) in Eclipse 
	 * 	b) in command line
	 * 
	 * 2) how to GET the input in the program 
	 * 	a) it's put into a String array (args)
	 * 	b) use args[i]
	 *  c) they're strings (args[0] + args[1])
	 * 
	 * 3) what if you give bad input? 
	 * 	a) wrong number 
	 * 		i) too many? (no problem!) 
	 * 		ii) too few? (runtime index out of bound error) 
	 * 	b) wrong type 
	 * 		i) runtime error
	 * 
	 */
	

	// ***** example 1 ****** //
	public static void computeSumHardCoded(String[] args) { 

		int start = 0;
		int stop = 10;

		int total = 0;
		for (int i = start; i < stop; i++) {
			total += i;
		}

		System.out.println(total);	
	}
	
	public static void computeSumFromInput(String[] args) { 

		int start = Integer.parseInt(args[0]);
		int stop = Integer.parseInt(args[1]);

		int total = 0;
		for (int i = start; i < stop; i++) {
			total += i;
		}

		System.out.println(total);	
	}
	// ***** example 2 ****** //
	public static void add(String[] args) {
		
		System.out.println(args[0] + args[1]);
		
	}
	
	// ***** example 3 ****** //
	public static void addAllArguments(String[] args) {
		
		// TODO: write a program to sum all the arguments, and print out the sum
		
	}
	

	public static void main(String[] args) {
		
		// EXAMPLE 1: motivating example
		// show this for eclipse + command line
		// try with wrong number of inputs
//		computeSumHardCoded(args);
//		computeSumFromInput(args);
		
		// EXAMPLE 2: ???
//		add(args);
		
		// EXAMPLE 3: Write some code
//		addAllArguments(args);
		
	}
}
