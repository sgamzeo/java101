import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        double average = (mat + fizik + turkce + kimya + muzik) / 5;
        System.out.println("\nOrtalamanız: " + average);
        if (average < 55) {
            System.out.println("Sınıfta kaldınız. Seneye tekrar görüşmek üzere!!!");
        }else{
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }


    }
}
