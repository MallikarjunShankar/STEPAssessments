import java.util.Scanner;
public class Q10 {

    public static void main(String[] args) {
        double height;        
        double totalInches;   
        int feet;            
        double inches;       

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your height in centimeters: ");
            height = input.nextDouble();
            totalInches = height / 2.54;
            feet = (int) (totalInches / 12);
            inches = totalInches - (feet * 12);
            System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + String.format("%.2f", inches));
        }
    }
}