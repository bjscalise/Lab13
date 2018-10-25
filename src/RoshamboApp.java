import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Player user = new Human(); // Creates an instance of play using the Human class.
		Player opponent; // Creates an object for the opponent.
		Roshambo userValue; // Holds a value for the users RPS choice.
		Roshambo opponentValue; // The opponent's choice.
		String userName;
		String contPrompt = "Y";

		Scanner scan = new Scanner(System.in);

		userName = Validator.getString(scan, "Please enter your name: ");
		user.setName(userName); // This sets the user name for future use.

		do {
			String userChoice = Validator.getString(scan,
					"Hello " + userName + ", would you like to play against the dogs or the cats? (D/C)");
			// This get prompts the user to choose dogs or cats. Dogs being an opponent that
			// only chooses rock and cats an opponent that chooses randomly.
			if (userChoice.equalsIgnoreCase("D")) {
				opponent = new Dummy(); // This assigns the opponent to the dummy class (only chooses rock).
			} else if (userChoice.equalsIgnoreCase("C")) {
				opponent = new Brainy();// This assigns the random opponent.
			} else {
				System.out.println("Please enter D or C");
				break;
			}

			userValue = user.generateRoshambo(); // This calls the human class and prompts the user to choose R,P or S.

			System.out.println("Your choice is: " + userValue);

			opponentValue = opponent.generateRoshambo(); // Assigns opponent value based on the Dogs/ cats decision.

			System.out.println("Opponent's choice is: " + opponentValue);

			RPSresult.displayResult(userValue, opponentValue); // This calls the Result Class and displays the result.

			System.out.println("Would you like to continue?");

			contPrompt = scan.nextLine();

		} while (contPrompt.equalsIgnoreCase("Y"));

		System.out.println("Good bye!");

	}
}

