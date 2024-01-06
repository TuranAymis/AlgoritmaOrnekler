import java.util.Scanner;

public class dortIslem {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int a,b,Z,X,C,V = 0;

        System.out.print("1. Sayıyı girin: ");
        a = scan.nextInt();
        System.out.print("2. Sayıyı girin :");
        b = scan.nextInt();

        Z = a + b;
        X = a - b;
        C = a * b;
        V = a / b;

        System.out.println("Toplam: "+ Z);
        System.out.println("Fark: "+ X);
        System.out.println("Çarpım: "+ C);
        System.out.println("Bölüm: "+ V);

    }
    
}
