import java.util.Random;

class Student{
        private String sex,name;
        private int age,height,weight;

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public int getHeight() {
         return height;
     }

     public void setHeight(int height) {
         this.height = height;
     }

     public int getWeight() {
         return weight;
     }

     public void setWeight(int weight) {
         this.weight = weight;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }

     public String getSex() {
         return sex;
     }

     public void setSex(String sex) {
         this.sex = sex;
     }

 }
    public class Important {
        public static void main(String[] args) {
            Student stu1=new Student();
            Random random=new Random();
            stu1.setAge(random.nextInt(31)+1);
        }
    }
