class Language {
    public void displayInfo() {
        System.out.println("Genel dil ozellikleri");
    }

}

class Python extends Language {
    public void displayInfo() {
        System.out.println("Python dil ozellikleri");
    }
}

public class Main {
    public static void main(String[] args) {
        Python p1 = new Python();
        p1.displayInfo();

        Language l1 = new Language();
        l1.displayInfo();
    }
}