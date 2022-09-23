import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        int mesafe, yonSecim, yas;
        double perKm = 0.10, borc, cocukBorc, gencBorc, yasliBorc, borcTip2, gencBorcTip2, yasliBorcTip2, cocukBorcTip2;
        boolean isError = false;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = inp.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas =inp.nextInt();

        System.out.print("Yolculuk tipini giriniz(1 ==> Tek Yön, 2 ==> Gidiş Dönüş): ");
        yonSecim = inp.nextInt();

        borc = mesafe * perKm;
        cocukBorc = borc * 0.50;
        gencBorc = borc * 0.90;
        yasliBorc = borc * 0.70;

        borcTip2 = (borc * 0.80) * 2 ;
        cocukBorcTip2 = (cocukBorc * 0.80) * 2;
        gencBorcTip2 = (gencBorc* 0.80) * 2;
        yasliBorcTip2 = (yasliBorc* 0.80) * 2 ;

        if (yas <= 12) {
            switch (yonSecim) {
                case 1:
                    System.out.println("Tutar: ₺" + cocukBorc);
                    break;
                case 2:
                    System.out.println("Tutar: ₺"+ cocukBorcTip2);
                    break;
                default:
                    isError = true;
            }
        } else if (yas > 12 && yas < 24 ) {
            switch (yonSecim) {
                case 1:
                    System.out.println("Tutar: ₺" + gencBorc);
                    break;
                case 2:
                    System.out.println("Tutar: ₺"+ gencBorcTip2);
                    break;
                default:
                    isError = true;
            }

        }else if (yas >= 65) {
            switch (yonSecim) {
                case 1:
                    System.out.println("Tutar: ₺" + yasliBorc);
                    break;
                case 2:
                    System.out.println("Tutar: ₺"+ yasliBorcTip2);
                    break;
                default:
                    isError = true;

            }
        } else {
            switch (yonSecim) {
                case 1:
                    System.out.println("Tutar: ₺" + borc);
                    break;
                case 2:
                    System.out.println("Tutar: ₺"+ borcTip2);
                    break;
                default:
                    isError = true;

            }
        }

        if (isError){
            System.out.println("Lütfen geçerli bir değer girdiğinizden emin olunuz.");
        }
    }
}

