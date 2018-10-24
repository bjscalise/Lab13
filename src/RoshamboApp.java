import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		// Declare/ initialize variables.
		Player user = new Human();
		Player oppenent;
		Roshambo userValue;
		Roshambo opponentValue;
		String userName; 
		
		Scanner scan = new Scanner(System.in);
		
		
		// Prompt user to enter name. Validate input.
		userName = Validator.getString(scan, "Please enter your name: ");
		user.setName(userName);
		// Prompt user to select opponent. Validate input.
		String userChoice = Validator.getStringDC(scan, "Would you like to play against the dogs or the cats? (D/C)");
		if (userChoice.equalsIgnoreCase("d")) {
			System.out.println(userChoice);  //Testing
			Player p1 = new Dummy();
		} else {
			Player p2 = new Brainy();
		}
		// Prompt user to select rock, paper, scissors. Validate input.
		userValue = Human.generateRoshambo();
		// Display opponent's choice.
		if (userChoice.equalsIgnoreCase("D")) {
			Player opponent = new Dummy();
			opponentValue = opponent.setOpponentValue(Roshambo.ROCK);
		} else (userChoice.equalsIgnoreCase("C"));
			Player opponent = new Brainy();
			opponentValue = Brainy.generateRoshambo();
			
			
		// Display user's choice.
		
		// Display results of match. Write a separate method.
		
		// Prompt the user to continue. Validate input.

	}

}
