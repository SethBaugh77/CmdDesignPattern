/**
 * Robot class that holds all the methods that are executed in the command
 * classes.
 * @author Jonathan Brown
 */
public class Robot {
	/**
	 * Constructor that takes in argument and prints out sentence with argument in
	 * sentence.
	 * @param name argument to be used in sentence.
	 */
	public Robot(String name) {
		System.out.print("Welcome, my name is " + name + ", I'm a friendly robot ");
	}

	/**
	 * Method to print out what happens when pickup command is called.
	 */
	public void pickup() {
		System.out.print("Oh treasure, picking it up! ");
	}

	/**
	 * Method to print out what happens when jump command is called.
	 */
	public void Jump() {
		System.out.print("Oh no a hazard, I'm jumping over it. ");
	}

	/**
	 * Method to print out what happens when fire command is called.
	 */
	public void Fire() {
		System.out.print("Bad guys! Fire my blow torch at them. ");
	}

	/**
	 * Method to print out what happens when heal command is called.
	 */
	public void Heal() {
		System.out.print("Thanks for healing my wounds. ");
	}

}
