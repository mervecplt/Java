import java.util.Scanner;

public class Main {
    /*
     * Kullanıcıdan bir kelime alınız aşağıdaki formatta ekrana bastırınız
     * 
     * c
     * c a
     * c a n
     * c a n a
     * c a n a n
     * 
     */
    public static void main(String[] args) {
        String kelime;
        int i, j;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz: ");
        kelime = scanner.nextLine();

        for (i = 0; i < kelime.length(); i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(kelime.charAt(j) + " ");
            }
            System.out.println();
        }

        scanner.close();

    }

}