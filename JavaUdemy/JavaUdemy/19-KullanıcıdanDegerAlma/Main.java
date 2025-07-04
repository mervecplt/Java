import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan Değer Alma
        System.out.print("Lutfen bir sayi degeri giriniz: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Sayi degerim:  " + number);

        input.close();

    }

}