import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String username, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adı: ");
        username = inp.nextLine();

        System.out.print("Şifre: ");
        password = inp.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız!");
        }else{
            System.out.println("Bilgileriniz hatalı!!");
        }
    }

}
