import java.util.Scanner;

public class OddCountEvenCount {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the number");
            int num=scan.nextInt();
            int evenCount=0,oddCount=0;
            int lastdigit;
            while (num > 0) { 
                lastdigit = num % 10;
                if(lastdigit % 2 == 0){
                    evenCount++;
                }else{
                    oddCount++;
                }
                num = num /10;
            }
            System.out.println("Even Count : " + evenCount);
            System.out.println("OddC ount : " + oddCount);
        }
    }
}
