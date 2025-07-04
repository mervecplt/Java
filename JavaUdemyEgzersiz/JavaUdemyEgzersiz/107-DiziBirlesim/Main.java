import java.util.Scanner;

public class Main {
    /*
     * Kullanıcı tarafından girilen A ve B dizilerine sırasıyla N ve K adet tamsayı
     * girilmektedir.
     * Bu iki dizinin birleştirilerek tek bir dizi haline getirilmesini sağlayan
     * programı
     * aşağıdaki fonksiyon prototipini kullanarak yazınız
     * 
     * void birlestir(int A[],int B[],int C[],int N,int K)
     */

    public static void birlesik(int[] A, int[] B, int[] C, int N, int K) {
        int sayac = 0, i, j;

        for (i = 0; i < N; i++) {
            C[sayac] = A[i];
            sayac++;
        }

        for (j = 0; j < K; j++) {
            C[sayac] = B[j];
            sayac++;
        }

    }

    public static void main(String[] args) {
        int N, K, i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ilk dizinin eleman sayisini giriniz: ");
        N = scanner.nextInt();

        int[] A = new int[N];

        for (i = 0; i < N; i++) {
            System.out.print((i + 1) + ". sayiyi giriniz");
            A[i] = scanner.nextInt();
        }

        System.out.print("Ikinci dizinin eleman sayisini giriniz: ");
        K = scanner.nextInt();
        int[] B = new int[K];

        for (i = 0; i < K; i++) {
            System.out.print((i + 1) + ". sayiyi giriniz");
            B[i] = scanner.nextInt();
        }

        int[] birlesik = new int[N + K];
        birlesik(A, B, birlesik, N, K);

        for (i = 0; i < N + K; i++) {
            System.out.print(birlesik[i] + " ");
        }

        scanner.close();
    }

}