import java.util.Scanner;

public class IkiSayiKarsilastir {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b=0;

        System.out.print("1. sayıyı girin: ");
        a = scan.nextInt();
        System.out.print("2. sayıyı girin: ");
        b = scan.nextInt();

        if(a>b){
            System.out.println(a+" büyüktür "+b);
        } else if (a<b) {
            System.out.println(a+" küçüktür "+b);
        }else {
            System.out.println(a+" eşittir "+b);
        }
    }
}
