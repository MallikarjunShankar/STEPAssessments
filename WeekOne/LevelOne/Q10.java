
import java.util.Scanner;
public class Q10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height;        
        double totalInches;   
        int feet;            
        double inches;       

        System.out.print("Enter your height in centimeters: ");
        height = input.nextDouble();
        totalInches = height / 2.54;
        feet = (int) (totalInches / 12);
        inches = totalInches - (feet * 12);
        System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + String.format("%.2f", inches));
        input.close();
    }
}