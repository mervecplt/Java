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
    // While döngüsü kullanarak yapınız
    public static void main(String[] args) {
        String kelime;
        int i, j;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz: ");
        kelime = scanner.nextLine();

        i = 0;
        while (i < kelime.length()) {
            j = 0;
            while (j <= i) {
                System.out.print(kelime.charAt(j) + " ");
                j++;
            }
            System.out.println();
            i++;
        }

        scanner.close();

    }

}