import java.util.Scanner;
public class KdvHesaplayici {
    public static void main(String[] args) {
        // Değişkenleri oluştur.
        double kdvsiz, kdv, kdvli;

        //Scanner sınıfımızı tanımladık.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al.
        System.out.print("Ürünün KDV hariç fiyatını giriniz: ");
        kdvsiz = inp.nextDouble();

        kdv = (kdvsiz * 18) / 100;
        kdvli = kdvsiz + kdv;



        System.out.println("Ürünün fiyatı: " + kdvsiz);
        System.out.println("KDV tutarı: " + kdv);
        System.out.println("Toplam tutar: " + kdvli);


    }

}
