import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50,60,70,80,90,100};
        System.out.println("Before Reverse : "+ Arrays.toString(array));
        System.out.println("============ =========== ============ ========== ===========");

        for(int i = array.length-1; i <= 0; i--) {
            System.out.println("After Reverse : "+ array[i] + " ");
        }
    }
}
