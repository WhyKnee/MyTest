import java.util.Random;
import java.util.Scanner;

public class Array {

    public static int[] initialArray(int a, int b, int c) {
        int[] arr;
        arr = new int[a];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(b - c + 1) + c;
           // System.out.print(arr[i] + " ");
        }
        return arr;
    }


    public static void sort(int[] arr){
        int temp;
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j<=arr.length-i-2;j++) {
                if(arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("请输入数组容量:");
        a = scanner.nextInt();
        System.out.println("请输入最大数值:");
        b = scanner.nextInt();
        System.out.println("请输入最小数值:");
        c = scanner.nextInt();
        if(c>b){System.out.println("ERROR!");}
        scanner.close();
        int[] arr=initialArray(a,b,c);
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}