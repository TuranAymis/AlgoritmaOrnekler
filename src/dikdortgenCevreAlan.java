import java.util.Scanner;

public class dikdortgenCevreAlan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b,cevre,alan = 0;

        System.out.print("1. kenarı giriniz: ");
        a = scan.nextDouble();
        System.out.print("2. kenarı giriniz: ");
        b = scan.nextDouble();

        cevre =  2*(a+b);
        alan = a*b;

        System.out.println("Cevre: "+cevre);
        System.out.println("Alan: "+alan);
    }
}
