class Student {
    private String name;
    private int age;

    Student() {
        this.name = "Hakan";
        this.age = 34;
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

        Student can = new Student();

        System.out.println(can.getName());
        System.out.println(can.getAge());

    }
}