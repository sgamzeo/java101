import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        int armut, elma, domates, muz, patlican;
        double armutKilo = 2.14, elmaKilo = 3.67 , domatesKilo = 1.11 , muzKilo = 0.95, patlicanKilo = 5.00, borc;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç kilo armut istersiniz?: ");
        armut = inp.nextInt();

        System.out.print("Kaç kilo elma istersiniz?: ");
        elma = inp.nextInt();

        System.out.print("Kaç kilo domates istersiniz?: ");
        domates = inp.nextInt();

        System.out.print("Kaç kilo muz istersiniz?: ");
        muz = inp.nextInt();

        System.out.print("Kaç kilo patlıcan istersiniz?: ");
        patlican = inp.nextInt();

        borc = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo);

        System.out.println("Borcunuz: " + borc);



    }

}
