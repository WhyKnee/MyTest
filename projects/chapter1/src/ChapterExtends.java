 class Animal{
        private int age,legsNum;
        private String color,name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName(){
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge(){
            return  age;
        }

        public void setColor(String color){
            this.color=color;
        }

        public String getColor(){
            return color;
        }

        public void setLegsNum(int legsNum){
            this.legsNum=legsNum;
        }

        public int getLegsNum(){
            return legsNum;
        }
     public void printInfo(){
         System.out.println(name+" is "+color+" and has "+legsNum+" legs");
     }
    }

         class Dogs extends Animal{
             Dogs() {
                 super.setLegsNum(4);
             }
    }
 public class ChapterExtends {
    public static void main(String[] args) {
        Dogs dog_1=new Dogs();
        dog_1.setName("pappy");
        dog_1.setAge(3);
        dog_1.setColor("Black");
        dog_1.printInfo();
    }
}
