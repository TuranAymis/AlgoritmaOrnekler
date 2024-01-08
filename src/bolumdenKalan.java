import java.util.Scanner;

public class bolumdenKalan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a,b,T=0.0;

        do{
            System.out.print("Modu alınacak sayıyı giriniz: ");
            a = scan.nextInt();
            System.out.print("Hangi modun alınacağını giriniz: ");
            b = scan.nextInt();
            System.out.println(a+" mod "+b+" = "+a%b);
        }while(a != 0);

        System.out.println("0 sayısı girildi ve çıkıldı");
        scan.close();
    }
}
