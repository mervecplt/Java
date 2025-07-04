import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.ensureCapacity(5);

        numbers.add(1);

        System.out.println(numbers);

    }
}