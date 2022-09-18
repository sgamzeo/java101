import java.util.Scanner;

public class HavaDurumuEtkinlik {
    public static void main(String[] args) {
        int heat;

        Scanner inp = new Scanner(System.in);

        System.out.print("Hava sıcaklığı(°C) : ");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapmak için mükemmel bir gün.");
        } else if (heat >= 5 && heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinema fikri kulağa hoş geliyor.");
            }

            if (heat >= 15) {
                System.out.println("Bugün tam piknik havası var.");
            }


        } else {
            System.out.println("Bugün hava şartları sadece yüzmeye elverişli gibi görünüyor.");


        }
    }
}
