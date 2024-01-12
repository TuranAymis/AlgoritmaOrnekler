import java.util.Scanner;

public class permutasyonHesap { //Çalışmıyor
    static int Faktoriyel(int sayi){
        int sonuc = 1;
            for (int i = 1; i <= sonuc; i++){
            sonuc *= i;
        }
        return sonuc;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Eleman sayısı giriniz: ");
        int n = scan.nextInt();
        System.out.print("Seçim sayısı giriniz: ");
        int r = scan.nextInt();
        int sonuc = Faktoriyel(n) / Faktoriyel(n-r);
        System.out.println("Permütasyon "+sonuc);
    }
}
