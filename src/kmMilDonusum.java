import java.util.Scanner;

public class kmMilDonusum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,T = 0;

        System.out.print("KM giriniz: ");
        a = scan.nextDouble();

        T = (0.621) * a;

        System.out.println(a+" km = "+T+" mildir.");
    }
}