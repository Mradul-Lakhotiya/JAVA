import java.util.*;

public class BinaryToDecimal {

    public static int BinaryToDecimal (int Binary) {
        int Decimal = 0, n = 0;

        while (Binary != 0) {
            Decimal += (int)(Binary%10) * (Math.pow(2, n++));
            Binary /= 10; 
        }

        return Decimal;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int Binary, Decimal;

        System.out.print("Enter The Number : ");
        Binary = sc.nextInt();

        Decimal = BinaryToDecimal(Binary);

        System.out.print("Decimal of "+ Binary + " = " + Decimal);
    }
}