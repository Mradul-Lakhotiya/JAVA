import java.util.Scanner;

class BinomialCofficient {

    public static double factorial (int num) {

        for (int i = (num-1); i > 1; i--) {
            num *= i;
        }

        return num;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, r;

        System.out.print("Enter n : ");
        n = sc.nextInt();
        System.out.print("Enter r : ");
        r = sc.nextInt();

        System.out.print("Cofficient is " + factorial(n)/(factorial(r)*factorial(n-r)));
    }
}