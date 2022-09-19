import java.util.Scanner;

public class SayilariKarsilastirma {
    public static void main(String[] args) {
        int a, b, c;

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen birbirinden farklı sayılar giriniz.");

        System.out.print("Birinci sayı: ");
        a = inp.nextInt();

        System.out.print("İkinci sayı: ");
        b = inp.nextInt();

        System.out.print("Üçüncü sayı: ");
        c = inp.nextInt();

        if ((a > b) && (a > c)){
            if (b > c){
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if ((b > a) && (b > c)){
            if (a > c){
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        } else if ((c > a) && (c > b)){
            if (a > b){
                System.out.println("c > a > b");
            } else {
                System.out.println("c > b > a");
            }
        }

    }
}
