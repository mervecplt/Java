import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i, j;
        System.out.print("   I");
        for (i = 1; i <= 10; i++) {
            System.out.print("   " + i);
        }
        System.out.println();
        for (i = 1; i <= 12; i++) {
            System.out.print("----");
        }
        System.out.println();
        for (i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
            for (j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

}