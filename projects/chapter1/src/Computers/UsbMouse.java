package Computers;

public class UsbMouse implements Usbable {
    @Override
    public void service()
    {
        System.out.println("Start using Mouse");
    }
}
