package JAVA.OPPS;
import java.util.Scanner;

public class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    // Add getters and setters for better encapsulation
    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImag() {
        return imag;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }
}

public class ComplexNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1, r2, i1, i2;

        System.out.print("Enter the real part of the first number: ");
        r1 = sc.nextInt();
        System.out.print("Enter the imaginary part of the first number: ");
        i1 = sc.nextInt();

        Complex a = new Complex(r1, i1);

        System.out.print("Enter the real part of the second number: ");
        r2 = sc.nextInt();
        System.out.print("Enter the imaginary part of the second number: ");
        i2 = sc.nextInt();

        Complex b = new Complex(r2, i2);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Complex sum = add(a, b);
                    System.out.println("Sum: " + sum.getReal() + " + " + sum.getImag() + "i");
                    break;
                case 2:
                    Complex difference = sub(a, b);
                    System.out.println("Difference: " + difference.getReal() + " - " + difference.getImag() + "i");
                    break;
                case 3:
                    Complex product = mult(a, b);
                    System.out.println("Product: " + product.getReal() + " * " + product.getImag() + "i");
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);
    }

    // Add methods for arithmetic operations
    public static Complex add(Complex a, Complex b) {
        return new Complex(a.getReal() + b.getReal(), a.getImag() + b.getImag());
    }

    public static Complex sub(Complex a, Complex b) {
        return new Complex(a.getReal() - b.getReal(), a.getImag() - b.getImag());
    }

    public static Complex mult(Complex a, Complex b) {
        return new Complex(
                a.getReal() * b.getReal() - a.getImag() * b.getImag(),
                a.getReal() * b.getImag() + a.getImag() * b.getReal()
        );
    }
}
