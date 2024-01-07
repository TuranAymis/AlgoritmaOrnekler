import java.util.Scanner;

public class sinusAlan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b,aci,T = 0;

        System.out.print("1. kenar uzunluğu: ");
        a = scan.nextDouble();
        System.out.print("2. kenar uzunluğu: ");
        b = scan.nextDouble();
        System.out.print("Kenarlar arasındaki açı: ");
        aci = scan.nextDouble();

        T=a*b*Math.sin(aci*Math.PI/180)/2;

        System.out.println("Üçgenin alanı: "+T);
    }
}
