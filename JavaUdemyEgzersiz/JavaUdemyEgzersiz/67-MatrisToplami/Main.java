import java.util.Scanner;

public class Main {

    // Kullanıcıdan 2 Adet Matrisin Satır Sutun Sayısını ve Matris Değerlerini
    // Alınız
    // İki Matrisin Toplamını Bulup Ekrana Bastırınız

    public static void main(String[] args) {
        int satir, sutun, i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen satir sayisini giriniz: ");
        satir = scanner.nextInt();

        System.out.print("Lutfen sutun sayisini giriniz: ");
        sutun = scanner.nextInt();

        int[][] a = new int[satir][sutun];
        int[][] b = new int[satir][sutun];
        int[][] toplam = new int[satir][sutun];

        System.out.println("A Matrisi Elemanlarini Giriniz:");

        for (i = 0; i < satir; i++) {
            for (j = 0; j < sutun; j++) {
                System.out.print("a[" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("B Matrisi Elemanlarini Giriniz:");

        for (i = 0; i < satir; i++) {
            for (j = 0; j < sutun; j++) {
                System.out.print("a[" + i + "][" + j + "]: ");
                b[i][j] = scanner.nextInt();
            }
        }

        for (i = 0; i < satir; i++) {
            for (j = 0; j < sutun; j++) {
                toplam[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Toplam Matrisi: ");
        for (i = 0; i < satir; i++) {
            for (j = 0; j < sutun; j++) {
                System.out.print(toplam[i][j] + "   ");
            }
            System.out.println();
        }

        scanner.close();
    }

}