
public class Main {
    public static void main(String[] args) {
        int[][] firstMatrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] secondMatrix = { { 7, 2, 5 }, { 2, 4, 6 } };

        int[][] carpim = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                carpim[i][j] = firstMatrix[i][j] * secondMatrix[i][j];
            }
        }

        System.out.println("Carpim matrisim:");
        for (int[] satir : carpim) {
            for (int kolon : satir) {
                System.out.print(kolon + " ");
            }
            System.out.println();

        }

    }
}