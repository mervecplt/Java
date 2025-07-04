
public class Main {
    public static void main(String[] args) {
        int[] sayilar = { 12, -6, 10, 15, 7, -35, 12, 30, 5, 9 };
        int toplam = 0;
        Double ortalama;
        int elemanSayisi;

        for (int sayi : sayilar) {
            toplam += sayi;
        }

        elemanSayisi = sayilar.length;

        ortalama = (double) toplam / (double) elemanSayisi;
        System.out.println("Sayi toplami: " + toplam);
        System.out.println("Ortalama: " + ortalama);

    }
}