import java.util.*;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side : ");
        int side = sc.nextInt();

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
}
