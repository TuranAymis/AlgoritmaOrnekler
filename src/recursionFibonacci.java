import java.util.Scanner;

public class recursionFibonacci { //Çalışmıyor

    static int fib(int n){
        if(n == 2 || n == 1){
            return 1;
        }else{
        return fib(n-1) + fib(-2);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=1;
        System.out.print("Sıra sayısını giriniz: ");
        n = scan.nextInt();
        scan.close();
        int sonuc = fib(n);
        System.out.println("Sonuç: " + sonuc);
    }
}
