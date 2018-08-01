package Lab;

public class User extends Player {
	
	//need to add constructor 
	public User() {
		super();
	}
	

	@Override
	public Roshambo generateRoshambo(String userInput) {
		//return value chosen 
		switch(userInput) {
		case "R":
		case "r":
			return Roshambo.ROCK;
			
		case "P":
		case "p":
			return Roshambo.PAPER;
		case "S":
		case "s":
			return Roshambo.SCISSORS;
		
		}
		
		return null;
	}

	

	//leave this method alone
	@Override
	public Roshambo generateRoshambo() {
		return null;
	}

}
