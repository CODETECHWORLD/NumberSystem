import java.util.Arrays;
import java.util.Scanner;

public class FindEvenOddIndexEle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size=scan.nextInt();
        int[] arr=new int[size];

        System.out.println("Enter your array elements");
        for (int i = 0; i < arr.length; i++) {
            int num=scan.nextInt();
            arr[i] = num;
            num=0;
        }
        System.out.println("Entered array elements : " + arr.length);
        System.out.println("Entered array elements : " + Arrays.toString(arr));
        findEvenOddIndexEle(arr);
    }

    public static void findEvenOddIndexEle(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                System.out.println("Even index Element : "+ i +" "+ arr[i]);
            }else{
                System.out.println("Odd index Element : "+ i +" "+ arr[i]);
            }
        }
    }
}
