
import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		// Get user input for values
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter cost: ");
		double numcost = kb.nextDouble();
		System.out.println("Enter amount tendered: ");
		double numpaid = kb.nextDouble();

		// Returns an error for not enough
		if (numcost > numpaid) {
			System.out.println("Insufficient funds. ");
		}
		// 
		if (numcost == numpaid) {
			System.out.println("Payment approved! ");
		}
		if (numcost < numpaid) {
			double numDifference = numpaid - numcost;
			CalChange();
			System.out.println("Amount owed: $" + numDifference);
		}

	}

	
	private static void CalChange() {
	// define a variable for coin values
		double quarter = 0.25;
		double dime = 0.10;
		double nickel = 0.05;
		double penny = 0.01;
		}
}