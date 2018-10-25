
public class Brainy extends Player {

	//Randomly assigns RPS based on the switch case.
	@Override
	public Roshambo generateRoshambo() {
		int randNum = (int) (Math.random() * 3);
		switch (randNum) {
		case 0:
			return Roshambo.SCISSORS;
		case 1:
			return Roshambo.PAPER;
		case 2:
			return Roshambo.ROCK;
		default:
			return null;
		}

	}

}
