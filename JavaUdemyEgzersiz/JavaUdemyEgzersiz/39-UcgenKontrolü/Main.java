import java.util.Scanner;

public class Main {

    /*
     * Bir üçgenin açılarını girdi olarak alan
     * ve bu üçgenin eşitkenar çeşitkenar üçgen olup olmadığını belirleyen programı
     * yazınız.
     * Açıların üçgen oluşturup oluşturmadığı da kontrol edilmelidir.
     */
    public static void main(String[] args) {

        int aci1, aci2, aci3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 adet aci giriniz");
        aci1 = scanner.nextInt();
        aci2 = scanner.nextInt();
        aci3 = scanner.nextInt();

        if (aci1 + aci2 + aci3 == 180) {
            if (aci1 == 60 && aci2 == 60 && aci3 == 60) {
                System.out.println("Eskenar ucgen");
            } else if (aci1 == aci2 || aci1 == aci3 || aci2 == aci3) {
                System.out.println("Ikizkenar ucgen");
            } else {
                System.out.println("Cesitkenar ucgen");
            }

        } else {
            System.out.println("Girdiginiz acilar ile ucgen olusturulamaz");
        }

        scanner.close();
    }

}