import java.util.*;

public class Calculator_if_else {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter NUM1 : ");
        int NUM1 = sc.nextInt();
        System.out.print("ENter NUM2 : ");
        int NUM2 = sc.nextInt();

        System.out.print("What need to be done : \nAdd (+)\nSub (-)\nMult (*)\nDiv (/)\nChoise : ");
        char operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.print(NUM1 + " + " + NUM2 + " = " + (NUM1 + NUM2));
        } 
        else if (operator == '-') {
            System.out.print(NUM1 + " - " + NUM2 + " = " + (NUM1 - NUM2));
        }
        else if (operator == '*') {
            System.out.print(NUM1 + " * " + NUM2 + " = " + (NUM1 * NUM2));
        }
        else if (operator == '/') {
            System.out.print(NUM1 + " / " + NUM2 + " = " + ((float)NUM1 / NUM2));
        }
        else {
            System.out.print("Enter a valid input");
        }
    }
}