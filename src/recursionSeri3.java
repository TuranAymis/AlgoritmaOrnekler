import java.util.Scanner;

public class recursionSeri3 {
    static double Seri(double n){
        if (n<1){
            return 0;
        }else {
            return ((Math.pow(n,2)-1))/((Math.pow(n,3)+2))+Seri(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n,sonuc;
        System.out.print("Seri açılımı için sayı giriniz: ");
        n = scan.nextInt();
        sonuc = Seri(n);
        System.out.println("Sonuç: "+sonuc);
    }
}
