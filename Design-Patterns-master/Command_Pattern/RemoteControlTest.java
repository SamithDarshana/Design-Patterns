package Command_Pattern;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(garageDoor);
        doorOpen.execute();
        Light light = new Light();
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        lightOffCommand.execute();


        //remote.setCommand(doorOpen);
        //remote.buttonWasPressed();

    }
}
