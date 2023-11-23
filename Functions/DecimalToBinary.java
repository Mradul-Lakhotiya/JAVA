import java.util.*;

public class DecimalToBinary {

    public static int DecimalToBinary(int Decimal) {
        int Binary = 0, place = 1;
    
        while (Decimal != 0) {
            Binary += (Decimal % 2) * place;
            Decimal /= 2;
            place *= 10;
        }
    
        return Binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Decimal, Binary;

        System.out.print("Enter The Number : ");
        Decimal = sc.nextInt();

        Binary = DecimalToBinary(Decimal);

        System.out.print("Binary of "+ Decimal + " = " + Binary);
    }
}
