import java.util.Scanner;

public class terstenYazdirma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = 0;

        System.out.print("Tersten yazdırılacak sayıyı girin: ");
        sayi = scan.nextInt();

        while (sayi != 0){
            System.out.print(sayi % 10);
            sayi /= 10;
        }

    }
}
