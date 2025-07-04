
public class Main {
    public static void main(String[] args) {
        int[][] firstMatrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] secondMatrix = { { 7, 2, 5 }, { 2, 4, 6 } };

        int[][] toplam = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                toplam[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        System.out.println("Toplam matrisim:");
        for (int[] satir : toplam) {
            for (int kolon : satir) {
                System.out.print(kolon + " ");
            }
            System.out.println();

        }

    }
}