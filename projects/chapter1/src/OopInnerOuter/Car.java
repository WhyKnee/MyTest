package OopInnerOuter;

public class Car {
   private String carName,carColor;
   private int carAge;

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }
    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public int getCarAge() {
        return carAge;
    }

    public Engine getInstance(){
        return new Engine();
    }
    public void showInfo(){
        getInstance().show();

    }
     class Engine{
       private String engineName;
       private int engineAge;

        public void setEngineAge(int engineAge) {
            this.engineAge = engineAge;
        }

        public void setEngineName(String engineName) {
            this.engineName = engineName;
        }

        public int getEngineAge() {
            return engineAge;
        }

        public String getEngineName() {
            return engineName;
        }

        public void show()
       {
           System.out.println("car name:"+getCarName()+"\n"+"car color:"+getCarColor()+"\ncar age:"+getCarAge()+"\nEngineInfo: "+getEngineAge()+" "+getEngineName());
       }
   }

   static class StiTest{
        void show(){
            System.out.println("调用了非静态方法");
        }
        static void shows(){
            System.out.println("调用了静态方法");
        }
   }
}
