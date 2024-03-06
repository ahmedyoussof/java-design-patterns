package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class DeviceController {

    private List<Command> commands = new ArrayList<>();

    private Command lastCommand;

    public Command getCommand(int index) {
        return commands.get(index);
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void setCommand(int index, Command command) {
        commands.add(index, command);
    }

    public void executeCommand(int index) {
        commands.get(index).execute();
        lastCommand = commands.get(index);
    }

    public void undo() {
        lastCommand.undo();
        commands.remove(lastCommand);
        if(!commands.isEmpty()) {
            lastCommand = commands.get(commands.size() - 1);
        } else {
            System.out.println("No more commands to undo");
        }

    }
}
