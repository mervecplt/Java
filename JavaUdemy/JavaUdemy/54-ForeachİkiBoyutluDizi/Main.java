
public class Main {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int[] satir : a) {
            for (int eleman : satir) {
                System.out.println(eleman);
            }
        }
    }
}