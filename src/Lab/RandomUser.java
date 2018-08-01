package Lab;
//helper class
public class RandomUser extends Player {

	public RandomUser() {
		super();
	}

	@Override
	public Roshambo generateRoshambo() {
		int randNum = (int) (Math.random()*3 +1); //math.random method returns a double, so must cast
		if (randNum == 1) {
			return Roshambo.ROCK;
		}
		else if (randNum == 2 ) {
			return Roshambo.SCISSORS;
		}
		else if (randNum == 3) {
			return Roshambo.PAPER;
		}
		return null;
	}

	@Override
	public Roshambo generateRoshambo(String userInput) {
		return null;
	}
}
