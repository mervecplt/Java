import java.util.Scanner;

public class Main {
    /*
     * Alfabe Kullanarak Yarım Piramid Oluşturma
     */

    public static void main(String[] args) {
        int i, j;
        char input, start;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen yarim piramidi sonlandirmak işstediginiz karakteri giriniz: ");
        input = scanner.next().charAt(0);

        start = 'A';

        for (i = 1; i <= (input - 'A' + 1); i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(start + " ");
            }
            start++;
            System.out.println();
        }

    }

}