import java.util.Scanner;

public class CharacterRigntAngleTringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines;
        char toprint = 'A';

        System.out.print("Enter the number of lines to be printed : ");
        lines = sc.nextInt();

        for (int i = 1; i <= lines; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(toprint++ +" ");
            }

            System.out.print("\n");
        }
       
    }
}
