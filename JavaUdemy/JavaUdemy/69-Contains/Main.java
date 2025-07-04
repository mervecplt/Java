
public class Main {
    public static void main(String[] args) {
        String message = "Python Programlamayi cok seviyorum";
        boolean sonuc = message.contains("onn");

        if (sonuc) {
            System.out.println("Aradiginiz ifade var");
        } else {
            System.out.println("Aradiginiz ifade yok");
        }

    }
}