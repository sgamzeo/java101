import java.util.Scanner;
public class HipotenusHesaplama {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. dik kenarın uzunuğunu giriniz: ");
        a = inp.nextInt();

        System.out.print("2. dik kenarın uzunluğunu giriniz: ");
        b = inp.nextInt();


        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Bu dik üçgenin hipotenüsü: " + c);

    }

}
