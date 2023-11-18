import java.util.*;
/**
 * even_odd_finder
 */
public class EvenOddFinder {
    public static void main(String atgs[]) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter a number : ");
       int num = sc.nextInt();

       String type = num % 2 == 0 ? "Even" : "Odd";

       System.out.println(type);
    }    
}