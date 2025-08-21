
import java.util.Scanner;

public class PassNagaZero {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int num=scan.nextInt();
            if (num>0) {
                System.out.println("Passitive");
            } else if(num < 0) {
                System.out.println("Nagative");
            }else{
                System.out.println("Zero");
            }
        }
    }
}