import java.util.Scanner;

public class Main {

    /*
     * 3 adet ürünümüz var:Kitap Temel Gıda ve Lüks Kategori
     * 
     * Devlet her 3 gruba farklı oranlarda vergi uyguluyor.
     * Kitap için %4.0,temel gıda için %5.6,lüks ürün gammı için %19.6
     * 
     * Her ürünün bir kodu var:Kitabın kodu 0,
     * temel gıdanın kodu 1,
     * lüks ürünün kodu 2
     * 
     * Kullanıcıdan istediğiniz ürünün kodunu ve fiyatını isteyen
     * daha sonra son fiyatı ekrana bastıran programı yazınız
     * 
     */
    public static void main(String[] args) {
        final double VERGI_KITAP = 4;
        final double VERGI_TEMELGIDA = 5.6;
        final double VERGI_LUX = 19.6;

        double fiyat;
        int kod;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen urunun fiyatini ve kodunu giriniz:");
        fiyat = scanner.nextDouble();
        kod = scanner.nextInt();

        switch (kod) {
            case 0:
                System.out.println("Fiyatimiz: " + (fiyat + fiyat * VERGI_KITAP / 100));
                break;
            case 1:
                System.out.println("Fiyatimiz: " + (fiyat + fiyat * VERGI_TEMELGIDA / 100));
                break;
            case 2:
                System.out.println("Fiyatimiz: " + (fiyat + fiyat * VERGI_LUX / 100));
                break;

            default:
                System.out.println("BOYLE BIR URUN YOK!");
                break;
        }

        scanner.close();
    }

}