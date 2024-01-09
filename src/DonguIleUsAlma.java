import java.util.Scanner;

public class DonguIleUsAlma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi,us,sonuc=1;
        
        System.out.print("Sayı giriniz: ");
        sayi = scan.nextInt();
        System.out.print("Üs giriniz: ");
        us = scan.nextInt();

        for(int i = 1; i<=us; i++){
            sonuc *=sayi;
        }
        System.out.println("Sonuç:"+sonuc);
    }
}
