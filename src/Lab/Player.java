package Lab;

public abstract class Player { //abstract class
	
	//name and value
	private String name;
	private Roshambo value;
	
	
	public abstract Roshambo generateRoshambo (); //abstract method, will need to overload later
	public abstract Roshambo generateRoshambo(String userInput); //overwritten method
	
	public Player() {
		super();
	}
	
	
	public Player(String name, Roshambo value) {
		super();
		this.name = name;
		this.value = value;
	}



	//getter and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Roshambo getValue() {
		return value;
	}
	public void setValue(Roshambo value) {
		this.value = value;
	}

	

}
