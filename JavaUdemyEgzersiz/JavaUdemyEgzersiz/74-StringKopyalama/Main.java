import java.util.Scanner;

public class Main {
    // Bir string ifadeyi diğer bir string ifadeye kopyalayın
    public static void main(String[] args) {
        String ilk, ikinci;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ilk degerini giriniz: ");
        ilk = scanner.nextLine();

        ikinci = ilk;

        System.out.print("Ilk degerim : " + ilk);
        System.out.print("Ilk degerim : " + ikinci);

        scanner.close();

    }

}