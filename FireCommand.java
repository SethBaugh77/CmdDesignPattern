/**
 * Class to represent fireCommand. Implements from Command interface.
 * @author Seth Baugh
 */
public class FireCommand implements Command {
    private Robot robot;

    /**
     * Constructor that sets robot equal to the argument _robot.
     * @param _robot argument to be set equal to robot.
     */
    public FireCommand(Robot _robot) {
        robot = _robot;
    }

    /**
     * Method that calls to the robots method Fire()
     */
    public void execute() {
        robot.Fire();
    }
}
