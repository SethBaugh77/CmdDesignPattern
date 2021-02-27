/**
 * Class to represent healing command. Implements from Command interface.
 * @author Seth Baugh
 */
public class HealCommand implements Command {
    private Robot robot;

    /**
     * Constructor that takes in _robot as an argument and sets the class robot
     * equal to it.
     * @param _robot argument to set equal to robot.
     */
    public HealCommand(Robot _robot) {
        robot = _robot;
    }

    /**
     * Method that calls the Heal method from the class variable robot.
     */
    public void execute() {
        robot.Heal();
    }

}
