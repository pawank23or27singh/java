package java12;
// import java.util.Scanner;


public class amstrong {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        for(int i=100;i<=999;i++){
            checkArmstrong(i);
        }
    }

    static void checkArmstrong(int num) {   
        int originalNum = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }

}
