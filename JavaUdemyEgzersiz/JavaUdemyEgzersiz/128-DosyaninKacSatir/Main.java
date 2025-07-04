
// Dosyadaki verinin kaç satır olduğunu bulma

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            int lineCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
            }
            System.out.println("Dosyamiz " + lineCount + " satirdan olusuyor");
            System.out.println("Dosyadan basarili bir sekilde okundu");
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Birseyler ters gitti" + e.getMessage());
        }

    }

}