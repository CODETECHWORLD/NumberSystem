import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the number");
            int num=scan.nextInt();
            int digitSum=0,org=num,sqr=num * num;
            int lastdigit;
            while (sqr > 0) { 
                lastdigit= sqr % 10;
                digitSum += lastdigit;
                sqr = sqr / 10 ;
            }
            if(org == digitSum){
                System.out.println("Neon Number");
            }else{
                System.out.println("Not a Neon Number");
            }
        }
    }
}
