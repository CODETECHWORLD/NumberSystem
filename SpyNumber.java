import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the number");
            int num=scan.nextInt();
            int sum=0,product=1;
            int lastdigit;
            while (num > 0) { 
                lastdigit = num % 10;
                sum += lastdigit;
                product *=lastdigit;
                num = num/10;
            }
            if(sum == product){
                System.out.println("Spy number");
            }else{
                System.out.println("Not a Spy number");
            }
        }
    }
}
