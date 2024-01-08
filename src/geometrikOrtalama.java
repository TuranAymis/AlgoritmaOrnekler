import java.util.Scanner;

public class geometrikOrtalama { //çalışmıyor
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double ort = 1.0;
        int n = 0,sayi = 0;

        do {
            System.out.print("Bir sayı giriniz, çıkmak için 0 giriniz: ");
            sayi = scan.nextInt();
            if (sayi != 0){
                ort += sayi;
                n++;
            }
        }while (sayi != 0);
        
        ort = Math.pow(ort, 1.0/(double) n);
        System.out.println("Geometrik ortalama: "+ort);

        scan.close();
    }
}
