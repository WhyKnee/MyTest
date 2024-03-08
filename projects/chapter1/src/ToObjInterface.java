interface Fruit{
    String type="foods";
    public abstract void setTaste();
    //public abstract String setName(String name);
    //void info();
}

class Apple implements Fruit{
    public void setTaste()
    {
        System.out.println("testgood");
    }
}

public class ToObjInterface {
    public static void main(String[] args) {
        Apple apple_1=new Apple();
        apple_1.setTaste();
    }
}
