public class TowerOfHanoi {

    public static void printer(int start, int end) {
        System.out.println(start + " --> "  + end);
    }

    public static void hanoi(int n, int start, int end) {
        int other = 6 - (start + end);
        if (n == 1)  {
            printer(start, end);
        }
        else {
            hanoi(n - 1, start, other);
            printer(start, end);
            hanoi(n - 1, other, end);
        }
    }

    public static void main(String[] args) {
        hanoi(3, 1, 3);
    }
}