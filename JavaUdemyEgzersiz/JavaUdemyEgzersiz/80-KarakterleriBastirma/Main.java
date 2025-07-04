import java.util.Scanner;

public class Main {
    // Girilen bir cumledeki karakterleri tek tek alt alta ekrana bastırınız
    public static void main(String[] args) {
        String yazi;
        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir yazi giriniz: ");
        yazi = scanner.nextLine();

        for (i = 0; i < yazi.length(); i++) {
            System.out.println(yazi.charAt(i));
        }

        scanner.close();

    }

}