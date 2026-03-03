import java.util.Scanner;

public class L3Q1 {
    public static void main(String[] args) {
        System.out.print("Enter the temperature in celsius: ");
        Scanner sc = new Scanner(System.in);
        float celsius = sc.nextFloat();
        float fahrenheitresult = (celsius * 9 / 5) + 32;
        System.out.print("The " +celsius+ " celsius is " +fahrenheitresult+ " fahrenheit");
    }
}