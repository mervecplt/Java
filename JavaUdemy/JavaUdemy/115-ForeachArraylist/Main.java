import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("C");
        languages.add("C#");
        languages.add("Javascript");
        languages.add("Java");
        languages.add("Python");

        for (String language : languages) {
            System.out.print(language + " ");
        }

    }
}