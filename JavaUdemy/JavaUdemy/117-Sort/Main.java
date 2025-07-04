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

        System.out.println("Siralanmadan once:");
        System.out.println(numbers);

        numbers.sort(Comparator.naturalOrder());
        System.out.println("Siralandiktan sonra:");
        System.out.println(numbers);

    }
}