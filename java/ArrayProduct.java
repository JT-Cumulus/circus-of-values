import java.util.Arrays;
import java.util.Hashtable;

public class ArrayProduct {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] test2 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(Arrays.toString(productArray(nums)));
    }

    public static int[] productArray(int[] inputArray){
        int arraySize = inputArray.length;
        
        int[] left = new int[arraySize];
        int[] cont = new int[arraySize];
        int[] right = new int[arraySize];

        left[0] = 1;
        right[arraySize - 1] = 1;

        for (int i = 1; i < arraySize; i++) {
            left[i] = left[i-1] * inputArray[i - 1];
        }

    }

}
