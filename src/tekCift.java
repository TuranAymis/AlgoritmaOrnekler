import java.util.Scanner;

public class tekCift {
     public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int a = 0;

        System.out.print("Sayı giriniz: ");
        a = scan.nextInt();

        if (a%2 == 0){
            System.out.println(a + " Çift");
        } else {
            System.out.println(a + " Tek");
        }


    }
}
