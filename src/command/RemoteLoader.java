package command;

import command.commad.*;
import command.reciever.CeilingFan;
import command.reciever.GarageDoor;
import command.reciever.Light;
import command.reciever.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand StereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand StereoOff = new StereoOffCommand(stereo);

        remoteControlWithUndo.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControlWithUndo.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControlWithUndo.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControlWithUndo.setCommand(3, garageDoorOpen, garageDoorClose);
        remoteControlWithUndo.setCommand(4, StereoOnWithCD, StereoOff);

        System.out.println(remoteControlWithUndo);

        remoteControlWithUndo.onButtonWasPressed(0);
        remoteControlWithUndo.offButtonWasPressed(0);
        remoteControlWithUndo.onButtonWasPressed(1);
        remoteControlWithUndo.offButtonWasPressed(1);
        remoteControlWithUndo.onButtonWasPressed(2);
        remoteControlWithUndo.offButtonWasPressed(2);
        remoteControlWithUndo.onButtonWasPressed(3);
        remoteControlWithUndo.offButtonWasPressed(3);
        remoteControlWithUndo.onButtonWasPressed(4);
        remoteControlWithUndo.offButtonWasPressed(4);
        remoteControlWithUndo.undoButtonWasPressed();

        System.out.println(remoteControlWithUndo);
    }
}
