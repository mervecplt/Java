import java.util.Scanner;

public class Main {

    // Matrisin transpose sini bulun

    /*
     * 1 2 9
     * 
     * 7 8 6
     * 
     * 1 7
     * 
     * 2 8
     * 
     * 9 6
     */
    public static void main(String[] args) {
        int satir, sutun, i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen satir sayisini giriniz: ");
        satir = scanner.nextInt();

        System.out.print("Lutfen sutun sayisini giriniz: ");
        sutun = scanner.nextInt();

        int[][] anamatris = new int[satir][sutun];
        int[][] transpoze = new int[sutun][satir];

        System.out.println("Anamatris Elemanlarini Giriniz:");

        for (i = 0; i < satir; i++) {
            for (j = 0; j < sutun; j++) {
                System.out.print("a[" + i + "][" + j + "]: ");
                anamatris[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Anamatris: ");
        for (i = 0; i < satir; i++) {
            for (j = 0; j < sutun; j++) {
                System.out.print(anamatris[i][j] + "   ");
            }
            System.out.println();
        }

        for (i = 0; i < satir; i++) {
            for (j = 0; j < sutun; j++) {
                transpoze[j][i] = anamatris[i][j];
            }
            System.out.println();
        }

        System.out.println("Transpoze Matris: ");
        for (i = 0; i < sutun; i++) {
            for (j = 0; j < satir; j++) {
                System.out.print(transpoze[i][j] + "   ");
            }
            System.out.println();
        }

        scanner.close();
    }

}