package Computers;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        UsbMouse useMouse = new UsbMouse();
        computer.usb = useMouse;
        computer.usb.service();
        Netcable netcable=new Netcable();
        computer.IO=netcable;
        computer.IO.net();
    }
}