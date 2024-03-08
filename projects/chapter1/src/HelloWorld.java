import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    public static void max()
    {
        Scanner scanner1=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        double x,y;
        System.out.print("Input a num:");
        x=scanner1.nextDouble();
        System.out.print("Input another num:");
        y=scanner2.nextDouble();
        double max=x>y?x:y;
        System.out.println("Max is "+max);
    }
    public static void week()
    {
        Scanner scanner=new Scanner(System.in);
        int inputnum= scanner.nextInt();
        // Random random=new Random();
        // int day=random.nextInt(6)+1;
        int day=inputnum;
        scanner.close();
        switch(day)
        {
            case 1:System.out.println("Monday");break;
            case 2:System.out.println("Tuesday");break;
            case 3:System.out.println("Wednesday");break;
            case 4:System.out.println("Thursday");break;
            case 5:System.out.println("Friday");break;
            case 6:System.out.println("Saturday");break;
            case 7:System.out.println("Sunday");break;
            default:System.out.println("Error!");
        }
    }
    public static void main(String[] args) {
     //max();
     //week();

    }
}
