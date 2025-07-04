
public class Main {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[10] = 50 / 2;

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally blogu");
        }

    }
}