import java.util.Scanner;

public class asalSayiKontrol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi,t = 0;

        System.out.print("Bir sayı giriniz: ");
        sayi = scan.nextInt();

        for(int i = 1; i <= sayi; i++){
            if(sayi%i==0){
                t++;
            }
        }
        if(t==2){
            System.out.println(sayi+" bir asal sayıdır.");
        }else{
            System.out.println(sayi+" bir asal sayı değildir.");
        }
    }
}
