import java.util.Scanner;
public class LoopMeanValue {
    public static void main(String[] args) {
    int k, i, toplam = 0, lenSayi = 0;

    Scanner inp = new Scanner(System.in);
    System.out.print("Sayı giriniz: ");
    k = inp.nextInt();


    for (i=1; i<=k; i++) {
        if ((i % 3 == 0) && (i % 4 ==0)) {
            toplam += i;
            lenSayi ++;
        }

    }
        System.out.println("Ortalamanız: " + (toplam/lenSayi));
    }
}
