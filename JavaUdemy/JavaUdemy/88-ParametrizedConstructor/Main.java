class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Hello");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}

public class Main {

    public static void main(String[] args) {
        // Recursive fonksiyon kullanarak faktoriyel hesabı yapınız

        Student can = new Student("Can", 33);
        Student osman = new Student("Osman", 34);

        System.out.println("Can'in bilgileri");
        System.out.println("Ad: " + can.getName());
        System.out.println("Yas: " + can.getAge());

        System.out.println("Osman'in bilgileri");
        System.out.println("Ad: " + osman.getName());
        System.out.println("Yas: " + osman.getAge());

    }
}