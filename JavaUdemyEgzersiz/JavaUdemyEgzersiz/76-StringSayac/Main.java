import java.util.Scanner;

public class Main {
    // Girilen string bir ifadedeki harf sayısını
    // sayıların kaç tane olduğunu boşluk sayısını bulunuz
    public static void main(String[] args) {
        String yazi;
        char karakter;
        int i, harfSayisi, boslukSayisi, sayiSayisi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir yazi giriniz: ");
        yazi = scanner.nextLine();

        harfSayisi = 0;
        boslukSayisi = 0;
        sayiSayisi = 0;

        for (i = 0; i < yazi.length(); i++) {
            karakter = yazi.charAt(i);
            if ((karakter >= 'a' && karakter <= 'z') || (karakter >= 'A' && karakter <= 'Z')) {
                harfSayisi++;
            } else if (karakter >= '0' && karakter <= '9') {
                sayiSayisi++;
            } else if (karakter == ' ') {
                boslukSayisi++;
            }

        }

        System.out.println("Harf sayisi: " + harfSayisi);
        System.out.println("Sayi sayisi: " + sayiSayisi);
        System.out.println("Bosluk sayisi: " + boslukSayisi);

        scanner.close();

    }

}