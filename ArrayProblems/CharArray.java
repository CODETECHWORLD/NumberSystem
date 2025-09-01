//Char Array to print ACSII value

public class CharArray {
    public static void main(String[] args) {
        char[] ch= {'j','a','v','a'};
        int[] arr={101,102,103,104};
        
        // for ACSSII value
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i] + " --- > : "+ (int)ch[i]);
        }
        System.out.println(" =============== ============== ============== ============");
        // for int to char
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " --- > : "+ (char)arr[i]);
        }
    }
}
