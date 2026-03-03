import java.util.Scanner;

public class L3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in fahrenheit: ");
        float fahrenheit = sc.nextFloat();
        float celsiusresult = (fahrenheit - 32) * 5 / 9;
        System.out.print("The " +fahrenheit+ " fahrenheit is " +celsiusresult+ " celsius");
    }
    
}