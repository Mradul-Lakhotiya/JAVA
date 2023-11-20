import java.util.*;

public class RunTillMultipalOf10IsEnterd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num;

        while (true) {
            System.out.print("Enter a Number : ");
            num = sc.nextInt();

            if (num % 10 == 0) {
                break;
            }
            
            System.out.println(num);
        }
    }
}
