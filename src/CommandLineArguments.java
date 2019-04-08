/**
 * Command line arguments
 * 
 * @author Sam
 **/
public class CommandLineArguments {

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
		
		System.out.println(args[0] + args[1]); // will this work?
		
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
		computeSumFromInput(args);
		
		// EXAMPLE 2: ???
//		add(args);
		
		// EXAMPLE 3: Write some code
//		addAllArguments(args);
		
	}
}
