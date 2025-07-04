import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan Değer Alma
        // System.out.print("Lutfen bir sayi degeri giriniz: ");
        // Scanner input = new Scanner(System.in);
        // float number = input.nextFloat();
        // System.out.println("Sayi degerim: " + number);

        // System.out.print("Lutfen bir sayi degeri giriniz: ");
        // Scanner input = new Scanner(System.in);
        // double number = input.nextDouble();
        // System.out.println("Sayi degerim: " + number);

        System.out.print("Lutfen bir karakter giriniz: ");
        Scanner input = new Scanner(System.in);
        char karakter = input.next().charAt(0);
        System.out.println("Karakter:  " + karakter);

        input.close();

    }

}