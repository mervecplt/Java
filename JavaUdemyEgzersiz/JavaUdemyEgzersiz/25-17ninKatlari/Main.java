import java.util.Scanner;

public class Main {
    /*
     * While döngüsü kullanarak 0 ile kullanıcıdan
     * aldığı n sayısı arasında yer alan 17'nin tüm tamsayı katlarını ekrana
     * bastıran programı yazınız.
     * Programınızı her satırda 10 adet sayı olacak şekilde düzenleyiniz.
     */
    public static void main(String[] args) {

        int limit, i, satirElemani;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Limiti belirleyiniz");
        limit = scanner.nextInt();

        i = 0;
        satirElemani = 0;
        while (i <= limit) {

            if (i % 17 == 0) {
                System.out.print(i + "   ");
                satirElemani++;
                if (satirElemani % 10 == 0) {
                    System.out.println();

                }

            }
            i++;
        }

        scanner.close();
    }

}