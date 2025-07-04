import java.util.Scanner;

public class Main {

    /*
     * İngiliz alfabesinden herhangi bir büyük veya küçük harfi ch değişkenine
     * okuyan
     * ve bu harfin alfabede kaçıncı harf olduğunu bulan programı yazınız.
     * 
     * 
     * Örnek Çıktı:
     * 
     * Bir harf giriniz:D
     * 
     * D 4. harftir.
     * 
     */
    public static void main(String[] args) {
        char ch;
        int sira;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir karakter giriniz: ");
        ch = scanner.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            sira = ch - 'A' + 1;
            System.out.println(ch + " harfimiz alfabede " + sira + ". siradadir");
        } else if (ch >= 'a' && ch <= 'z') {
            sira = ch - 'a' + 1;
            System.out.println(ch + " harfimiz alfabede " + sira + ". siradadir");
        } else {
            System.out.println("Boyle bir harf yok");
        }
        scanner.close();
    }

}