import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(-3);
        numbers.add(66);
        numbers.add(55);
        numbers.add(10);

        ArrayList<Integer> cloneNumber = (ArrayList<Integer>) numbers.clone();
        System.out.println(cloneNumber);

    }
}