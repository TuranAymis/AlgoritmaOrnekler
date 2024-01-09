import java.util.Scanner;

public class basamaklarinToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,toplam = 0;

        System.out.print("Sayi giriniz: ");
        sayi = scan.nextInt();

        while(sayi !=0){
            toplam += sayi%10;
            sayi /= 10;
        }
        System.out.println("Basamakların toplamı: "+toplam);
    }
}
