import java.util.Scanner;

public class Main {
    /* Klavyeden girilen bir cümledeki kelime sayısını bulan programı yazınız */
    // Split ile yapınız
    public static void main(String[] args) {
        String yazi;
        String[] kelimeler;
        int kelimeSayisi = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir yazi giriniz: ");
        yazi = scanner.nextLine();

        kelimeler = yazi.split(" ");

        for (String kelime : kelimeler) {
            kelimeSayisi++;
        }

        System.out.println("Cumledeki kelime sayisi: " + kelimeSayisi);

        scanner.close();

    }

}