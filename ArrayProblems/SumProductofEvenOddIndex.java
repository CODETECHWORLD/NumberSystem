import java.util.Arrays;
import java.util.Scanner;

public class SumProductofEvenOddIndex {
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
        countSumProduct(arr);
    }

    public static void countSumProduct(int[] arr) {
        int indexevenSum=0,indexOddSum=0;
        int indexevenProduct=1,indexOddProduct=1;
        System.out.println("Entered array elements : " + arr.length);
        System.out.println("Entered array elements : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){ // index even or odd
                indexevenSum += arr[i];
                indexevenProduct *= arr[i];
            }else{
                indexOddSum += arr[i];
                indexOddProduct *= arr[i];
            }
        }
        System.out.println("Even Index Element Sum : "+  indexevenSum);
        System.out.println("Even Index Element Product : "+  indexevenProduct);
        System.out.println(" ============= ============= ============= ============ =========");
        System.out.println("Odd Index Element Sum : "+  indexOddSum);
        System.out.println("Odd Index Element Product : "+  indexOddProduct);
        
        
    }
}
