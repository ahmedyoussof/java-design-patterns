package behavioral.command;

public class Client {

    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);

        Camera camera = new Camera();
        Command cameraStartRecordingCommand = new CameraStartRecordingCommand(camera);



        DeviceController remoteControl = new DeviceController();
        remoteControl.setCommand(0, lightOnCommand);
        remoteControl.setCommand(1, cameraStartRecordingCommand);

        remoteControl.executeCommand(0);
        remoteControl.executeCommand(1);

        remoteControl.undo();
        remoteControl.undo();
    }
}
