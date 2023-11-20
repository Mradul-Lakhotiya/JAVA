import java.util.Scanner;

public class TableOfNumberNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, times;

        System.out.print("Enter the number for the table : ");
        num = sc.nextInt();

        System.out.print("Enter the number till you want the table : ");
        times = sc.nextInt();

        for (int i = 1; i <= times; i++) {
            System.out.println(i + " x " + num + " = " + num * i);
        }
    }
}