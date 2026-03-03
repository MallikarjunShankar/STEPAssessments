import java.util.Scanner;
public class Q9 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fee: ");
        int fee = input.nextInt();
        System.out.print("Enter the discount percentage: ");
        int discountPercent = input.nextInt();
        double discountAmount = (fee * discountPercent) / 100.0;
        double discountedFee = fee - discountAmount;
        System.out.println("The discount amount is INR "+discountAmount+" and final discounted fee is INR "+discountedFee);

    }
    
}