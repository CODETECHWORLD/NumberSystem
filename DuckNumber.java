import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the number");
            int num=scan.nextInt();
            int lastdigit;
            String res="Not a Duck Number";
            while (num > 0) {
                lastdigit = num % 10;
                if(lastdigit == 0){
                    res = "Duck Number";
                    break;
                }
                num = num / 10;
            }
            System.out.println(res);
        }
    }
}
