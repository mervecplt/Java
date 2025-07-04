
public class Main {

    public static int faktoriyel(int n) {
        if (n != 0) {
            return n * faktoriyel(n - 1);
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        // Recursive fonksiyon kullanarak faktoriyel hesabı yapınız
        int sonuc;

        sonuc = faktoriyel(4);
        System.out.println("4! = " + sonuc);
    }
}