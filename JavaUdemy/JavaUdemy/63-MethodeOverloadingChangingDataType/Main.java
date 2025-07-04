
public class Main {
    public static void display(int a) {
        System.out.println("Argümanlarim: " + a);
    }

    public static void display(String ad) {
        System.out.println("Argümanlarim: " + ad);
    }

    public static void main(String[] args) {
        display(5);
        display("Can");
    }
}