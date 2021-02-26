

public class HealCommand implements Command{
private Robot robot;
    public HealCommand(Robot _robot)
    {
        robot = _robot;
    }

    public void execute()
    {
        robot.Heal();
    }


    
    
}
