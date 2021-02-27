/**
 * Class that represents a jumpping command. Implements from Command interface.
 * @author Nick Brady
 */
public class JumpCommand implements Command {
    private Robot robot;

    /**
     * Constructor that takes in robot as an argument and sets class robot equal to
     * argument robot.
     * @param robot argument to set class robot equal to argument.
     */
    public JumpCommand(Robot robot) {
        this.robot = robot;
    }

    /**
     * Method that calls the Jump command from the class variable robot.
     */
    public void execute() {
        robot.Jump();
    }

}
