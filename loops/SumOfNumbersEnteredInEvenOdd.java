import java.util.Scanner;

public class SumOfNumbersEnteredInEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num, EvenSum = 0, OddSum = 0;
        int Continue;

        do {
            System.out.print("Enter a number : ");
            Num = sc.nextInt();

            if (Num % 2 == 0) {
                EvenSum += Num;
            } else {
                OddSum += Num;
            }

            System.out.println("To Continue Enter '1', to Exit Enter '0'");
            Continue = sc.nextInt();

        } while (Continue == 1); // Change the loop condition to check if Continue is equal to 1
        
        // Print the sums after the loop exits
        System.out.println("Sum of even numbers: " + EvenSum);
        System.out.println("Sum of odd numbers: " + OddSum);
    }
}
