import java.util.*;

public class PrimeInRange {

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
        int to, from;

        System.out.print("Enter from : ");
        from = sc.nextInt();
        System.out.print("Enter to : ");
        to = sc.nextInt();

        for (int i = from; i <= to; i++) {
            if (IsPrime(i)) {
                System.out.print(i + ", ");
            }
        }
   }
}
