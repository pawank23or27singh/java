package java12;
import java.util.Arrays;

public class passingFunctions {
    public static void main(String[] args) {
        int[] nums={3 ,4,6,12};
        System.out.println("Original array: " + Arrays.toString(nums));
        modifyArray(nums);
        System.out.println("Modified array: " + Arrays.toString(nums));
    }

    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }
    
}
