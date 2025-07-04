
public class Main {
    public static void main(String[] args) {

        int x = 5, y = 6, z = 7, max;

        if (x >= y) {
            if (x >= z) {
                max = x;
            } else {
                max = z;
            }

        } else {
            if (y >= z) {
                max = y;
            } else {
                max = z;
            }
        }

        System.out.println("Maksimum sayim: " + max);

    }
}