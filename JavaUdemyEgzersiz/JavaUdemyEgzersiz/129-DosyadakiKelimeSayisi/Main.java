
// Dosyadaki verinin kaç kelimeden oluştuğunu bulma

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            int lineCount = 0;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;

                StringTokenizer tokenizer = new StringTokenizer(line);
                wordCount += tokenizer.countTokens();
            }
            System.out.println("Dosyadaki kelime sayisi:  " + wordCount);
            System.out.println("Dosyadan basarili bir sekilde okundu");
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Birseyler ters gitti" + e.getMessage());
        }

    }

}