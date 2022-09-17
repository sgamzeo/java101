import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kilo, boy, sonuc;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu (kg) giriniz: ");
        kilo = inp.nextDouble();

        System.out.print("Lütfen boyunuzu (m) giriniz: ");
        boy = inp.nextDouble();

        sonuc = kilo / (boy * boy);

        System.out.println("Vücut kitle endeksiniz: " + sonuc);

    }

}
