
import java.util.Scanner;


/*
 * reduce the last digit one by one, increace count varible count if reduce a number
 * 
 */

public class DigitCount {

    public int findLastDigit(int num){
        int count=0;
        while (num > 0) {
            num=num/10;
            System.out.println(num);
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int num=scan.nextInt();
            DigitCount dc= new DigitCount();
            int count= dc.findLastDigit(num);
            System.out.println("Number of digit in give number "+count);
        }
    }   
}
