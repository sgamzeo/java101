import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        n1 = inp.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        n2 = inp.nextInt();

        System.out.println("1- Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = inp.nextInt();

        System.out.println(select);

        switch (select){
            case 1:
                System.out.println("Toplama işleminin sonucu: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma işleminin sonucu: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma işleminin sonucu: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme işlemin sonucu: " + (n1 / n2));
                }else {
                    System.out.println("Hiçbir sayı 0'a bölünemez.");
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız. Lütfen bir sayı girdiğinizden emin olunuz.");
        }

    }

}
