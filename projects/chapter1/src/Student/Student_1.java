package Student;

public class Student_1 implements Playable, Studiable {
    @Override
    public void play(){
        System.out.println("I can Play anything");
    }
    @Override
    public void study(){
        System.out.println("I can Study everything by IntelNet");
    }
}
