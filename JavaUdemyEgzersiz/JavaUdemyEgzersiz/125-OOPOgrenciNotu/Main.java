import java.util.Scanner;

class Student {
    private String name;
    private String lesson;
    private double marks;

    Student(String studentName, String studentLesson, double studentMarks) {
        this.name = studentName;
        this.lesson = studentLesson;
        this.marks = studentMarks;
    }

    public String calculateGrade() {
        if (this.marks >= 90) {
            return "A";
        } else if (this.marks >= 80) {
            return "B";
        } else if (this.marks >= 70) {
            return "C";
        } else if (this.marks >= 60) {
            return "D";
        } else {
            return "F";

        }
    }

    public void displayInformation() {
        System.out.println("Ad: " + this.name);
        System.out.println("Ders: " + this.lesson);
        System.out.println("Puan: " + this.marks);
        System.out.println("Not: " + this.calculateGrade());
    }
}

// Bir öğrencinin adını aldığı dersi dersten aldığı paunı bir class ın içinde
// tutunuz aldığı puana göre notunu hesaplayan fonksiyonu class içinde yazıp
// öğrenci bilgilerini bastırınız
public class Main {

    public static void main(String[] args) {
        String studentName, studentLesson;
        double studentMarks;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ogrenci bilgileri:");
        System.out.print("Ogrenci adini giriniz: ");
        studentName = scanner.nextLine();

        System.out.print("Ogrencinin aldigi dersi giriniz: ");
        studentLesson = scanner.nextLine();

        System.out.print("Ogrencinin dersten aldigi puani giriniz: ");
        studentMarks = scanner.nextDouble();

        Student student = new Student(studentName, studentLesson, studentMarks);
        student.displayInformation();

        scanner.close();
    }

}