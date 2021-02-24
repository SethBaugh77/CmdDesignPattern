package commanddesignpattern;
import java.util.HashMap;

public class InputHandler {
    private HashMap<String, command> commands = new HashMap<String, command>();

    public InputHandler(Robot robot) {
        commands.set("pickup", PickupCommand);
        commands.set("jump", JumpCommand);
        commands.set("fire", FireCommand);
        commands.set("heal", HealCommand);

    }

    public void inputEntered(String data) {
        if(commands.get(data) != null) {
            commands.get(data).execute();
       

    }

}
