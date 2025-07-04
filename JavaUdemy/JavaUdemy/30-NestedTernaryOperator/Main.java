
public class Main {
    public static void main(String[] args) {

        int x = 5, y = 6, z = 7, max;

        max = (x >= y) ? ((x >= z) ? x : z) : ((y >= z) ? y : z);

        System.out.println("Maksimum sayim: " + max);

    }
}