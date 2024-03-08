package OopInnerOuter;

public class Test1 {
    public static void main(String[] args) {
        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写了swim方法");
            }
        };

        new Animal(){

            @Override
            void eat() {
                System.out.println("实现了eat方法");
            }
        };
    }
}
