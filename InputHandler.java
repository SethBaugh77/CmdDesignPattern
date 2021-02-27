import java.util.HashMap;

/**
 * Class that holds all the inputs from the user. Holds commands in hashtable
 * and calls correct ones when prompted.
 * @author Sophie Bacon
 */
public class InputHandler {
    private HashMap<String, Command> commands = new HashMap<String, Command>();

    /**
     * Constructor that takes in a robot, creates commands with that robot as a
     * parameter, and puts those commands into the hashmap.
     * @param robot to be usen as a parameter for the four command classes.
     */
    public InputHandler(Robot robot) {
        Command Fire = new FireCommand(robot);
        Command Heal = new HealCommand(robot);
        Command Jump = new JumpCommand(robot);
        Command Pickup = new PickupCommand(robot);

        commands.put("pickup", Pickup);
        commands.put("jump", Jump);
        commands.put("fire", Fire);
        commands.put("heal", Heal);
    }

    /**
     * Method that takes in user input, checks to see if the input is in the
     * hashtable, and either executes the command or returns.
     * @param data user input to check if it is in the hashmap.
     */
    public void inputEntered(String data) {

        if (data.equalsIgnoreCase("Pickup") || data.equalsIgnoreCase("Heal") || data.equalsIgnoreCase("Fire")
                || data.equalsIgnoreCase("Jump")) {
            commands.get(data).execute();
        } else {
            System.out.println("Invalid command");
            return;
        }

    }
}
