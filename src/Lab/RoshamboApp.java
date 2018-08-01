package Lab;

import java.util.Scanner;

// the main 
public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Player human = new User();
		Player computer = null;
		String userName;
		String userChoice;
		String userInput;
		Roshambo value = null;
		Roshambo userValue;
		String answer = "y";

		// getting the player's name
		do {
			userName = Validator.getString(scan, "Please enter your name: ");
			human.setName(userName);

			// asking for the choice of opponent
			userChoice = Validator.getString(scan, "Would you like to play against? TheJets or TheSharks?(J/S)");
			userInput = Validator.getString(scan, "Rock, paper, or scissors? (R/P/S): ");
			if (userChoice.equalsIgnoreCase("j")) {
				// j is going to be our dummy rock class
				computer = new DummyRock(); // declaring the new object
				computer.setName("TheJets"); // what's going on here..?
				value = computer.generateRoshambo();

				System.out.println("TheJets: " + value); // calling the method

			} else if (userChoice.equalsIgnoreCase("s")) {
				computer = new RandomUser();
				computer.setName("TheSharks");
				value = computer.generateRoshambo();
				System.out.println("TheSharks: " + value);

			}

			userValue = human.generateRoshambo(userInput);
			System.out.println(userName + ": " + userValue);

			// calling displayresult method to print out the result
			System.out.println(displayResults(computer, human, userValue, value));

			// System.out.println();
			answer = Validator.getString(scan, "Play again?(y/n)");
			// scan.nextLine();
			//when using validator class, try to use it for everything

		} while (answer.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");
		scan.close();
	}

	// create second method to display the results
	public static String displayResults(Player computer, Player human, Roshambo userValue, Roshambo value) {
		if (userValue == value) {
			return "It's a draw!";
		} else if (userValue == Roshambo.ROCK && value == Roshambo.PAPER
				|| userValue == Roshambo.PAPER && value == Roshambo.SCISSORS
				|| userValue == Roshambo.SCISSORS && value == Roshambo.ROCK) {
			return computer.getName() + " wins!";

		} else {
			return human.getName() + " wins!";
		}
		// if same, draws
	}

}
