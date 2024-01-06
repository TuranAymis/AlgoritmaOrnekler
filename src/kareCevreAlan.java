import java.util.Scanner;

public class kareCevreAlan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, cevre, alan = 0;

        System.out.println("Karenin bir kenarının uzunluğunu giriniz: ");
        a = scan.nextInt();

        cevre = 4*a;
        alan = a*a;

        System.out.println("Çevresi: " + cevre);
        System.out.println("Alanı: " + alan);

    }
}
