
import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		// Get user input for values
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter cost: ");
		double numcost = kb.nextDouble();
		System.out.println("Enter amount tendered: ");
		double numpaid = kb.nextDouble();

// Returns an error for not enough money paid
		if (numcost > numpaid) {
			System.out.println("Insufficient funds. ");
		}
// returns message for exact change 
		if (numcost == numpaid) {
			System.out.println("Payment approved! ");
		}
		if (numcost < numpaid) {
// set values for coins to calculate change owed
			double quarter = 0.25;
			double dime = 0.10;
		      double nickel = 0.05;
		      double penny = 0.01;
		      
// round changeDue to 2 decimal places
		      double numChange = ( (double)((int) Math.round((numpaid - numcost)*100)) / 100.0 );
// determine the value each coin denomination needed for change
		      double modQuarters = ( (double)((int) Math.round((numChange % quarter)*100)) / 100.0 );
		      double modDimes = ( (double)((int) Math.round((modQuarters % dime)*100)) / 100.0 );
		      double modNickels = ( (double)((int) Math.round((modQuarters % nickel)*100)) / 100.0 );
		      double modPennies = ( (double)((int) Math.round((modQuarters % penny)*100)) / 100.0 );
		      
// determine the amount of of coins for each coin denomination 
		      int numQuarters = (int)((numChange - modQuarters) / (quarter));
		      int numDimes = (int)((modQuarters - modDimes) / (dime));
		      int numNickels = (int)((modDimes - modNickels) / (nickel));
		      int numPennies = (int)((modNickels - modPennies) / (penny));			

// Return message with exact coins needed
		    System.out.println("Amount owed: $" + numChange);
			System.out.println("Number of quarters owed: " + numQuarters);
		    System.out.println("Number of dimes owed: " + numDimes);
		    System.out.println("Number of nickels owed: " + numNickels);
		    System.out.println("Number of pennies owed: " + numPennies);		}

	}

	
}