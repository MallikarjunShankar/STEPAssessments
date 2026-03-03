import java.util.Scanner;
public class L2Q1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number 1: ");
            float number1 = sc.nextFloat();
            System.out.print("Enter Number 2: ");
            float number2 = sc.nextFloat();
            System.out.print("The addition, subtraction, multiplication and division of "
                + number1 + " and " + number2 + " is "
                + (number1 + number2) + ", "
                + (number1 - number2) + ", "
                + (number1 * number2) + " and "
                + (number1 / number2));
        }
    }
}