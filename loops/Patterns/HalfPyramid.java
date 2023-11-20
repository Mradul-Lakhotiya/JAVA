import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines;

        System.out.print("Enter the number of lines to be printed : ");
        lines = sc.nextInt();

        for (int i = 1; i <= lines; i++) {

            for (int j = 0; j < (lines - i); j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.print("\n");
        }
       
    }
}