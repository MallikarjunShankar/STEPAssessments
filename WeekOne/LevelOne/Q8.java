import java.util.Scanner;
public class Q8 {
    public static void main (String[] args){
        System.out.println("Enter the distance in kilometers: ");
        Scanner input = new Scanner(System.in);
        double km;
        km = input.nextInt();
        System.out.println("The total miles is " + (km*1.6) + " mile for the given " + km + " km");

    }
}
