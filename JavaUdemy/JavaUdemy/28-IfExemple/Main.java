import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kişinin yaş bilgisini alınız
        // Kişinin araba sürüp süremeyeceğini ekrana bastırınız

        Scanner input = new Scanner(System.in);
        System.out.print("Yasinizi giriniz: ");
        int yas = input.nextInt();

        if (yas >= 18) {
            System.out.println("Araba surebilirsiniz");
        } else {
            System.out.println("Araba suremezsiniz!");
        }
        input.close();

    }
}