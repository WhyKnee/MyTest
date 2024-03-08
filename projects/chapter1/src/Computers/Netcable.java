package Computers;

public class Netcable implements IOther{
    @Override
    public void power(){
        System.out.println("Do not need supply power");
    }
    @Override
    public void net(){
        System.out.println("Allow net current");
    }
    @Override
    public void wireless(){
        System.out.println("The device is not wireless");
    }
}
