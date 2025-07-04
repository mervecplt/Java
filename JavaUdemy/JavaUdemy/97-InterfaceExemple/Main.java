interface Language {
    void getName(String name);

}

class ProgrammingLanguage implements Language {
    public void getName(String name) {
        System.out.println("Programlama dili: " + name);
    }

}

public class Main {
    public static void main(String[] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.getName("C");
    }
}