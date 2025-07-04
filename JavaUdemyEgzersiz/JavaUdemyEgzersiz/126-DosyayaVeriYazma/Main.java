
// Dosyaya veri yazma işlemini yapınız

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"))) {
            writer.write("Ilk satir");
            writer.newLine();
            writer.write("Ikinci satir");
            writer.newLine();
            writer.write("Ucuncu satir");
            writer.newLine();
            writer.write("Dorduncu satir");
            writer.newLine();
            writer.write("Besinci satir");

            System.out.println("Dosyaya basarili bir sekilde yazildi");
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Birseyler ters gitti" + e.getMessage());
        }

    }

}