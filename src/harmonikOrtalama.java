import java.util.Scanner;

public class harmonikOrtalama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ort=0.0, sayi = 0.0;
        int n=0;

        do {
            System.out.print("Bir sayı giriniz, çıkmak için 0 giriniz: ");
            sayi = scan.nextDouble();
            if(sayi != 0){
                ort += 1.0/sayi;
                n++;
            }
        
            }while(sayi != 0);
            ort = ((double)n)/ort;
            System.out.println("Harmonik ortama: "+ort);
            scan.close();
        }
}