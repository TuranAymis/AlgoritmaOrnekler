import java.util.Scanner;

public class ucgenPisagor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double k1,k2,T = 0;

        System.out.print("1. kenarın uzunluğu: ");
        k1 = scan.nextDouble();
        System.out.print("2. kenarın uzunluğu: ");
        k2 = scan.nextDouble();

        T =  Math.sqrt(k1*k1+ k2*k2);

        System.out.println("Hipotenüs: "+T);
    }
}
