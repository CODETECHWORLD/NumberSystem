import java.util.Scanner;

public class FindLastDigit {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int num=scan.nextInt();
            int lastdigit=num%10;
            System.out.println("Last Digit of a given number : "+lastdigit);
        }
    }
}
