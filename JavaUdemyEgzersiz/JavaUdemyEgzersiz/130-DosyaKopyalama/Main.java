
// Dosyadaki verinin kaç kelimeden oluştuğunu bulma

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("test_copy.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Dosyanin kopyasi basarili bir sekilde olusturuldu");
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Birseyler ters gitti" + e.getMessage());
        }

    }

}