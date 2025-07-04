import java.util.Scanner;

public class Main {
    // Girilen string bir ifadedeki harfler dışındaki tüm karakterleri silip ekrana
    // bastırınız
    public static void main(String[] args) {
        String yazi, yeniYazi;
        int i;
        char karakter;

        yeniYazi = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir yazi giriniz: ");
        yazi = scanner.nextLine();

        for (i = 0; i < yazi.length(); i++) {
            karakter = yazi.charAt(i);

            if ((karakter >= 'a' && karakter <= 'z') || (karakter >= 'A' && karakter <= 'Z')) {
                yeniYazi = yeniYazi + karakter;
            }
        }

        System.out.println("Harfler disindaki tum karakterler silindikten sonra: " + yeniYazi);

        scanner.close();

    }

}