import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {
    public static void main(String[] args){
        ElectronicDevice newDevice = TVRemote.getDevice();
        TurnTVOn onCommand = new TurnTVOn(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();
        /*---------------------------------------*/
        TurnTVUp volUpCommand = new TurnTVUp(newDevice);
        onPressed = new DeviceButton(volUpCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();
        onPressed.press();
        /*---------------------------------------*/
        TurnTVDown volDownCommand = new TurnTVDown(newDevice);
        onPressed = new DeviceButton(volDownCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();
        /*---------------------------------------*/
        Television theTv = new Television();
        Radio theRadio = new Radio();
        List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();

        allDevices.add(theTv);
        allDevices.add(theRadio);

        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
        turnThemOff.press();

        /*TurnTVOff offCommand = new TurnTVOff(newDevice);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();*/

        /*---------------------------------------*/
        turnThemOff.pressUndo();
    }
}
