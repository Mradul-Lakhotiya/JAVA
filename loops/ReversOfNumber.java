import java.util.*;

public class ReversOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num, rnum = 0;

        System.out.print("Enter a number : ");
        num = sc.nextInt();

        while(num != 0) {
            rnum = rnum*10 + num % 10;
            num /= 10;
        }

        System.out.println("The Revers will be " + rnum);
    }    
}
