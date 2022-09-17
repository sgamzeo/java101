import java.util.Scanner;
public class DaireHesaplama {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, cevre, alan;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = inp.nextInt();

        cevre = 2 * pi * r;
        alan = pi * r * r;

        System.out.println("Dairenin çevresi: " + cevre);
        System.out.println("Dairenin alanı: " + alan);
    }

}
