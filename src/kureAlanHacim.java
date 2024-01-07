import java.util.Scanner;

public class kureAlanHacim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r,alan,hacim=0;
        double pi = 3.14;

        System.out.print("Dairenin yarı çapını giriniz: ");
        r = scan.nextDouble();

        alan = 4*pi*r*r;
        hacim = (4/3)*pi*r*r*r;

        System.out.println("Alan: "+alan);
        System.out.println("Hacim: "+hacim);

    }
}
