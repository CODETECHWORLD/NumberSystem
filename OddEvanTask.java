import java.util.Scanner;

public class OddEvanTask {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the number");
            int num=scan.nextInt();
            int oddSum=0,oddProduct=1;
            int EvenSum=0,EvenProduct=1;
            int lastdigit;
            while (num > 0) {
                lastdigit = num %10;
                if(lastdigit % 2 == 0){
                    EvenSum += lastdigit;
                    EvenProduct *=lastdigit;
                }else{
                    oddSum += lastdigit;
                    oddProduct *= lastdigit;
                }
                num= num /10;
            }

            System.out.println("EvenProduct : "+ EvenProduct);
            System.out.println("EvenSum : "+ EvenSum);
            System.out.println("oddProduct : "+ oddProduct);
            System.out.println("oddSum : " + oddSum);

        }
    }
}
