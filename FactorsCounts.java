import java.util.Scanner;

public class FactorsCounts {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the number : ");
            int num=scan.nextInt();
            int FactorsCounts=0;
            for (int i = 1; i <= num; i++) {
                if(num%i == 0){
                    // System.out.println(i);
                    FactorsCounts++;
                }
            }
            System.out.println(FactorsCounts);
        }
    }
}
