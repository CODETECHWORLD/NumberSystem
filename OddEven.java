import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int num=scan.nextInt();
            int res=num%2;
            if(res == 0){
                System.out.println("Given number is Even Number");
            }else{
                System.out.println("Given number is odd Number");
            }
        }
    }
}
