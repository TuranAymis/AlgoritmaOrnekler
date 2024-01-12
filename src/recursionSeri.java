import java.util.Scanner;

public class recursionSeri {
    static double Seri(double n){
        if(n<1){
            return 0;
        }else{
            return (n/(n+1))+Seri((n-1));
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n,sonuc;
        System.out.print("Seri açılımı için sayı giriniz: ");
        n = scan.nextInt();
        sonuc = Seri(n);
        System.out.println("Sonuç: " + sonuc);
    }
}
