
abstract class Language {

    public void display() {
        System.out.println("Python programlama dili");
    }

}

public class Main extends Language {
    public static void main(String[] args) {
        Main object = new Main();
        object.display();

    }
}