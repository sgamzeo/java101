import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kilo, boy, indeks;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu (kg) giriniz: ");
        kilo = inp.nextDouble();

        System.out.print("Lütfen boyunuzu (m) giriniz: ");
        boy = inp.nextDouble();

        indeks = kilo / (boy * boy);

        System.out.println("Vücut kitle endeksiniz: " + indeks);

    }

}
