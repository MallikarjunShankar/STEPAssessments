import java.util.Scanner;
public class L2Q2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        float basecm = sc.nextFloat();
        float heightcm = sc.nextFloat();
        float areacm = (basecm * heightcm) / 2;
        float basein = basecm / 2.54f;
        float heightin = heightcm / 2.54f;
        float areain = (basein * heightin) / 2;
        System.out.println("The area of the triangle in sq in is " + areain + " and sq cm is " + areacm + " "); 
    }
}