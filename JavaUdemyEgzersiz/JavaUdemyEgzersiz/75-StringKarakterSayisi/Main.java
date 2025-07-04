import java.util.Scanner;

public class Main {
    // String bir ifadeki kullanıcının girmiş olduğu karakterin kaç kere
    // kullanıldığını bulun
    public static void main(String[] args) {
        String message = "Java Programlamyi cok seviyorum";
        char karakter;
        int sayac, i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen istediginiz karakteri giriniz: ");
        karakter = scanner.next().charAt(0);

        sayac = 0;
        for (i = 0; i < message.length(); i++) {
            if (message.charAt(i) == karakter) {
                sayac++;
            }

        }

        System.out.println("Girmis oldugunuz " + karakter + " karakteri " + sayac + " defa kullanilmistir");

        scanner.close();

    }

}