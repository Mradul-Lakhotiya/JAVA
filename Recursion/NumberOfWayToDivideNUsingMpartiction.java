// Write a function that counts the number of ways you can
// partition n objects using parts up to m (assuming m ≥ 0


public class NumberOfWayToDivideNUsingMpartiction {

    public static int counter(int a, int b) {
        if (a == 0) {
            return 1;
        }
        else if (a < 0 || b == 0) {
            return 0;
        }
        else {
            return counter(a - b, b) + counter(a, b - 1);
        }
    }

    public static void main(String[] args) {
        
        System.out.println(counter(20,8));
    }
}