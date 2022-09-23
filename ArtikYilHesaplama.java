import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        System.out.print("ARTIK YIL HESAPLAMA");
        int year;
        boolean leapYear = false;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        year = inp.nextInt();

        if(year % 4 == 0){
            leapYear = true;

            if (year % 100 == 0 && year % 400 != 0) {
                leapYear = false;
            }

        }

        if(leapYear){
            System.out.println(year + " bir artık yıldır!");
        }
        else{
            System.out.println(year + " bir artık yıl değildir!");
        }
    }
}
