//WAJP to count the odd index and even index elements present in an array

import java.util.Arrays;
import java.util.Scanner;

public class CountOddEvenIndexElement {
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
        countElements(arr);
    }

    public static void countElements(int[] arr) {
        int indexevencount=0,indexOddcount=0;
        System.out.println("Entered array elements : " + arr.length);
        System.out.println("Entered array elements : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                indexevencount++;
            }else{
                indexOddcount++;
            }
        }
        System.out.println("Even Index Elements : "+  indexevencount);
        System.out.println("Odd Index Elements : "+  indexOddcount);
    }
}
