package java12;

public class maxEle {
    public static void main(String[] args) {
        int[] numbers = {45, 10, 15, 20, 25};
        int max = findMax(numbers);
        System.out.println("Maximum element: " + max);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
