class BankaHesabi {
    private String hesapNo;
    private double bakiye;

    BankaHesabi(String hesapno, double baslangicBakiyesi) {
        this.hesapNo = hesapno;
        this.bakiye = baslangicBakiyesi;
    }

    public void paraYukleme(double tutar) {
        this.bakiye += tutar;
        System.out.println("Para yukleme islemi basarali! Guncel bakiye:" + this.bakiye);
    }

    public void paraCekme(double tutar) {
        if (tutar <= this.bakiye) {
            this.bakiye -= tutar;
            System.out.println("Para cekme islemi basarali! Guncel bakiye:" + this.bakiye);
        } else {
            System.out.println("Bakiye yetersiz!");
        }
    }
}

public class Main {
    // Banka hesabına dair class tanımlaması yapınız içinde hesap no ve başlangıc
    // bakiyesi bilgisi tutulsun.
    // Para çekme ve para yükleme aksiyonlarını class içerisinde tanımlayınız.
    public static void main(String[] args) {
        String hesapno = "Ak-Ortakoy 231232112312";
        double baslangicBakiyesi, yuklenenTutar, cekilenTutar;
        baslangicBakiyesi = 2000;
        System.out.println("Baslangic bakiyesi:" + baslangicBakiyesi);

        BankaHesabi hesap = new BankaHesabi(hesapno, baslangicBakiyesi);

        yuklenenTutar = 5000;
        System.out.println("Yuklenen tutar:" + yuklenenTutar);
        hesap.paraYukleme(yuklenenTutar);

        cekilenTutar = 1000;
        System.out.println("Cekilen tutar:" + cekilenTutar);
        hesap.paraCekme(cekilenTutar);

    }

}