import java.util.*;

public class PrimeCheaker {

   public static boolean IsPrime (int num) {

        if (num == 2) {
        return true;
        } 
        else if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
   }

   public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number : ");
        num = sc.nextInt();

        if (IsPrime(num)) {
            System.out.println(num + " is prime");
        }
        else {
            System.out.println(num + " is not a prime");
        }
   }
}
