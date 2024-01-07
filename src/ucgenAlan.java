import java.util.Scanner;

public class ucgenAlan {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x,h,T=0;

        System.out.print("Taban değerini giriniz: ");
        x = scan.nextDouble();
        System.out.print("Yükseklik değerini giriniz: ");
        h = scan.nextDouble();

        T=x*h/2;

        System.out.println("Üçgenin alanı: "+T);
    }
}
