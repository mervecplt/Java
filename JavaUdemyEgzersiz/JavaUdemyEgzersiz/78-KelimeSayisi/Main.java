import java.util.Scanner;

public class Main {
    /* Klavyeden girilen bir cümledeki kelime sayısını bulan programı yazınız */
    public static void main(String[] args) {
        String yazi;
        int i, boslukSayisi;
        char karakter;

        boslukSayisi = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir yazi giriniz: ");
        yazi = scanner.nextLine();

        for (i = 0; i < yazi.length(); i++) {
            karakter = yazi.charAt(i);

            if (karakter == ' ') {
                boslukSayisi++;
            }
        }

        System.out.println("Cumledeki kelime sayisi: " + (boslukSayisi + 1));

        scanner.close();

    }

}