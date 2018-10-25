
public class Dummy extends Player {

	@Override
	public Roshambo generateRoshambo() {
		// Provides the method for the opponent that only selects rock.
		return Roshambo.ROCK;
	}

}
