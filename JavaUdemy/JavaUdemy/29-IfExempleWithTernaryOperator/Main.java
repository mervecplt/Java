import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kişinin yaş bilgisini alınız
        // Kişinin araba sürüp süremeyeceğini ekrana bastırınız

        Scanner input = new Scanner(System.in);
        System.out.print("Yasinizi giriniz: ");
        int yas = input.nextInt();
        String sonuc = (yas >= 18) ? "Araba surebilirsiniz" : "Araba suremezsiniz!";

        System.out.println(sonuc);

        input.close();

    }
}