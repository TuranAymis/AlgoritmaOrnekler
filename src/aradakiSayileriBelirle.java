import java.util.Scanner;

public class aradakiSayileriBelirle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int baslangic,bitis,adim,toplam = 0;

        System.out.print("Başlangıç değerini girin: ");
        baslangic = scan.nextInt();
        System.out.print("Bitiş değerini girin: ");
        bitis = scan.nextInt();
        System.out.print("Adım değerini girin: ");
        adim = scan.nextInt();

        for(int i=baslangic; i<=bitis; i+=adim){
            toplam += i;
        }
        System.out.println("Toplam: "+toplam);
    }
}
