import java.util.Scanner;

public class AddingOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.print("Enter The value of x : ");
        x = sc.nextInt();

        System.out.println(x + " + 1 = " + -~x);
    }
}
