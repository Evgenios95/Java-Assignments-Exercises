import java.util.Arrays;

public class ReverseArrayChallenge {
    
    private static void reverse(int[] array){
        System.out.println("Array = " +Arrays.toString(array));
        for (int i = 0; i < array.length/2; i++) {
            int temporaryVar = array[i];
            array[i] = array[array.length-1 -i];
            array[array.length-1 -i] = temporaryVar;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
    
    public static void main(String[] args) {
        int[] array = {1,4,5,7,8,2,3,564,132};
        reverse(array);
    }
}
