import java.util.Scanner;

public interface PerfactNumber {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the number");
            int num=scan.nextInt();
            int sum=0;
            for (int i = 1; i < num; i++) {
                if(num % i == 0){
                    sum += i;
                }
            }
            if(num == sum){
                System.out.println("Perfact Number");
            }else{
                System.out.println("Not a Perfact Number");
            }
        }
    }
}
