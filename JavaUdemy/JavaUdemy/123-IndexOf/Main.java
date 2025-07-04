import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.ensureCapacity(5);

        numbers.add(1);
        numbers.add(-3);
        numbers.add(66);
        numbers.add(55);
        numbers.add(10);

        System.out.println(numbers.indexOf(54));

    }
}