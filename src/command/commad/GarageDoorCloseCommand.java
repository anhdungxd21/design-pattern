package command.commad;

import command.reciever.GarageDoor;

public class GarageDoorCloseCommand implements Command{
    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
