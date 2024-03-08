package Computers;

public class UsbFan implements Usbable{
    @Override
    public void service(){
        System.out.println("Start using Fan");
    }
}
