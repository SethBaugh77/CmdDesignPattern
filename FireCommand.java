

public class FireCommand implements Command{
    private Robot robot;
    public FireCommand(Robot _robot)
    {
        robot = _robot;
    }
    public void execute()
    {
        robot.Fire();
    }
}
