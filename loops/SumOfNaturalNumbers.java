import java.util.*;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value to start from : ");
        int from = sc.nextInt();
        System.out.print("ENter the value to end at : ");
        int to = sc.nextInt();

        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }

        System.out.println("The sum of all the Natural number from " + from +" to " + to + " is " + sum);
    }
}
