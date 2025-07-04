import java.util.Scanner;

public class Main {

    /*
     * Bir sınıfta bulunan öğrencilerden hangisinin boyunun 150 cm' ye en yakın
     * olduğunu hesaplayan
     * programı yazınız.
     * Bu program öğrenci numaralarını ve cm cinsinden boy uzunluklarını girdi
     * olarak alan almalıdır.
     * Öğrenci numarası negative bir sayı girilinceye kadar veri girişi devam
     * etmelidir.
     * 
     * Örnek Çıktı:
     * Öğrenci no:124
     * Öğrenci boy:167
     * 
     * 
     * Öğrenci no:7540
     * Öğrenci boy:154
     * 
     * Öğrenci no:566
     * Öğrenci boy:148
     * 
     * 
     * Öğrenci no:2149
     * Öğrenci boy:166
     * 
     * 
     * 566 numaralı öğrenci 148 cm boyuyla 150 cm e en yakındır.
     * 
     */
    public static void main(String[] args) {
        int no, boy, minno, minboy, fark;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ogrenci no: ");
        no = scanner.nextInt();
        System.out.print("Ogrenci boyu: ");
        boy = scanner.nextInt();

        minno = no;
        minboy = boy;
        fark = Math.abs(boy - 150);

        while (no >= 0) {
            System.out.print("Ogrenci no: ");
            no = scanner.nextInt();

            if (no < 0) {
                break;
            }
            System.out.print("Ogrenci boyu: ");
            boy = scanner.nextInt();

            if (Math.abs(boy - 150) < fark) {
                minno = no;
                minboy = boy;
                fark = Math.abs(boy - 150);

            }

        }

        System.out.println(minno + " numarali ogrenci " + minboy + " boyuyla 150 cm'e en yakindir");

        scanner.close();
    }

}