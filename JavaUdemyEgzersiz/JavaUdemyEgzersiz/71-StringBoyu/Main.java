import java.util.Scanner;

public class Main {
    // Girilen string ifadenin boyunu hesaplayınız
    public static void main(String[] args) {
        String message;
        int boy;
        Scanner scanner = new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        message = scanner.nextLine();

        boy = message.length();

        System.out.print("String ifademizin boyu: " + boy);
        scanner.close();

    }

}