/**
 * Class representing a pickup command. Implements from Command interface.
 * @author Nick Brady
 */
public class PickupCommand implements Command {
    private Robot robot;

    /**
     * Constructor that uses robot argument to set to class variable robot.
     * @param robot argument to set class variable equal to.
     */
    public PickupCommand(Robot robot) {
        this.robot = robot;
    }

    /**
     * Method to call to pickup method from class variable robot.
     */
    public void execute() {
        robot.pickup();
    }
}
