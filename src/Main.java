import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String input = "";
        String input2, input3;

        System.out.println("give me a string friend!");
        while (true) {
            input = scan.nextLine();

            if ("END".equals(input)) {
                break;
            }

            boolean isInt = true;
            try {
                int integer = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                isInt = false;
            }

            boolean isDouble = true;
            try {
                double dbl = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                isDouble = false;
            }

            if (isInt) {
                System.out.printf("%s is not string%n", input);
            } else if (isDouble) {
                System.out.printf("%s is not string%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is not string%n", input);
            } else if ("true".equals(input.toLowerCase()) || "false".equals(input.toLowerCase())) {
                System.out.printf("%s is not string%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
                break;
            }
        }

        System.out.println("i would like two identical strings now:  ");
        input2 = scan.nextLine();
        input3 = scan.nextLine();

        if (Objects.equals(input2, input3)) {

            System.out.println("nice job listening!!");
        } else {
            System.out.println("is it that hard?");
        }
    }
}