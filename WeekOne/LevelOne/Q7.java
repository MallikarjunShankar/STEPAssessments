public class Q7 {
     public static void main (String[] args){
        int radius = 6378;
        double Volumekms = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        double radiusmiles = radius * 1.6;
        double Volumemiles = (4.0/3.0) * Math.PI * Math.pow(radiusmiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + Volumekms + " and cubic miles is " + Volumemiles);

    }
}
