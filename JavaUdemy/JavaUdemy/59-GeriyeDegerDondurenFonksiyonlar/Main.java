
public class Main {

    public static int Square(int kenar) {
        int alan;
        alan = kenar * kenar;
        return alan;

    }

    public static void main(String[] args) {
        int sonuc = Square(5);

        System.out.println("Karenin alani: " + sonuc);

    }
}