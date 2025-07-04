
public class Main {
    public static void display(int a) {
        System.out.println("Argümanlarim: " + a);
    }

    public static void display(int a, int b) {
        System.out.println("Argümanlarim: " + a + " " + b);
    }

    public static void main(String[] args) {
        display(5);
        display(5, 15);
    }
}