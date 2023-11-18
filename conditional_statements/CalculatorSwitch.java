import java.util.*;

public class CalculatorSwitch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter NUM1 : ");
        int NUM1 = sc.nextInt();
        System.out.print("ENter NUM2 : ");
        int NUM2 = sc.nextInt();

        System.out.print("What need to be done : \nAdd (+)\nSub (-)\nMult (*)\nDiv (/)\nChoise : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+' : 
                System.out.println(NUM1 + " + " + NUM2 + " = " + NUM1 + NUM2);
                break;
            case '-' :
                System.out.println(NUM1 + " - " + NUM2 + " = " + (NUM1 - NUM2));
                break;
            case '*' :
                System.out.println(NUM1 + " * " + NUM2 + " = " + NUM1 * NUM2);
                break;
            case '/' :
                System.out.println(NUM1 + " / " + NUM2 + " = " + (float)NUM1 / NUM2);
                break;
            default : 
                System.out.println("Enter a valid operator");
                break;
        }
    }
}
