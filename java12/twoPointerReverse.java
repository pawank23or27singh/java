package java12;

public class twoPointerReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + java.util.Arrays.toString(array));
        reverseArray(array);
        System.out.println("Reversed array: " + java.util.Arrays.toString(array));
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
