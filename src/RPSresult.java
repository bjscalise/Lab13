
public class RPSresult {

	static int winCount;
	static int lossCount;
	static int tie;

	/*This Class assigns the win/loss to each contest. At the end of each contest a w/l/t counter
	will display the total results.*/
	public static int displayResult(Roshambo userValue, Roshambo opponentValue) {

		if (userValue == Roshambo.ROCK && opponentValue == Roshambo.ROCK) {
			System.out.println("Tie");
			tie++;
		} else if (userValue == Roshambo.ROCK && opponentValue == Roshambo.PAPER) {
			System.out.println("Loss");
			lossCount++;
		} else if (userValue == Roshambo.ROCK && opponentValue == Roshambo.SCISSORS) {
			System.out.println("Win!");
			winCount++;
		} else if (userValue == Roshambo.PAPER && opponentValue == Roshambo.ROCK) {
			System.out.println("Win!");
			winCount++;
		} else if (userValue == Roshambo.PAPER && opponentValue == Roshambo.PAPER) {
			System.out.println("Tie");
			tie++;
		} else if (userValue == Roshambo.PAPER && opponentValue == Roshambo.SCISSORS) {
			System.out.println("Loss");
			lossCount++;
		} else if (userValue == Roshambo.SCISSORS && opponentValue == Roshambo.ROCK) {
			System.out.println("Loss");
			lossCount++;
		} else if (userValue == Roshambo.SCISSORS && opponentValue == Roshambo.PAPER) {
			System.out.println("Win!");
			winCount++;
		} else if (userValue == Roshambo.SCISSORS && opponentValue == Roshambo.SCISSORS) {
			System.out.println("Tie");
			tie++;

		}
		System.out.println("wins: " + winCount);
		System.out.println("losses: " + lossCount);
		System.out.println("ties " + tie);
		return winCount;

	}
}
