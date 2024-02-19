import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffreReader {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Reading a String
            System.out.print("Enter a String: ");
            String s = br.readLine();

            // Reading an Integer
            System.out.print("Enter an Integer: ");
            int x = Integer.parseInt(br.readLine());

            // Reading a Float
            System.out.print("Enter a Float: ");
            float y = Float.parseFloat(br.readLine());

            // Reading a Character
            System.out.print("Enter a Character: ");
            char c = br.readLine().charAt(0);

            // Displaying the input values
            System.out.println("String: " + s);
            System.out.println("Integer: " + x);
            System.out.println("Float: " + y);
            System.out.println("Character: " + c);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
