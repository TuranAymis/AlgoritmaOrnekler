import java.util.Scanner;

public class ikinciDereceDenklem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b,c,D;

        System.out.print("Katsayı A giriniz: ");
        a = scan.nextDouble();
        System.out.print("Katsayı B giriniz: ");
        b = scan.nextDouble();
        System.out.print("Katsayı C giriniz: ");
        c = scan.nextDouble();

        D = (b*b)-4*a*c;

        if (D>0){
            double x1 = (-b+Math.sqrt(D))/2*a;
            double x2 = (-b-Math.sqrt(D))/2*a;
            System.out.println("Kök 1 (x1): "+x1);
            System.out.println("Kök 2 (x2): "+x2);
        } else if (D==0) {
            double x1 = (-b+Math.sqrt(D))/2*a;
            System.out.println("Kök 1 (x1): "+x1);
        } else if (D<0) {
            System.out.println("Reel kökler yoktur.");
        }
    }
}
