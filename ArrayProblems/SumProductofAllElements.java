import java.util.Arrays;
import java.util.Scanner;

public class SumProductofAllElements {
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
        sumProductofElements(arr);
    }

    public static void sumProductofElements(int[] array){
        int sum=0,Product=1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            Product *= array[i];
            
        }
        System.out.println("Lenght of array elements : " + array.length);
        System.out.println("Entered array elements : " + Arrays.toString(array));
        System.out.println("Sum of array elements : " + sum);
        System.out.println("Product of  array elements : " + Product);

    }
}
