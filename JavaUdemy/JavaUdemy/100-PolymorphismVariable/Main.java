class Language {
    public void display() {
        System.out.println("Programlama dili");
    }

}

class Java extends Language {
    public void display() {
        System.out.println("Java Programlama dili");
    }

}

public class Main {
    public static void main(String[] args) {
        Language lg;
        lg = new Language();
        lg.display();

        lg = new Java();
        lg.display();
    }
}