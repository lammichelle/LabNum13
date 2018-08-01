package Lab;

public class DummyRock extends Player {

	public DummyRock() {
		super();
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK; //will always return Rock
	}

	@Override
	public Roshambo generateRoshambo(String userInput) {
		return null;
	}
	
	

}
