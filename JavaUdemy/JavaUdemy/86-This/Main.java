class Student {
    private String name;
    private int age;

    public void display() {
        System.out.println("Hello");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}

public class Main {

    public static void main(String[] args) {
        // Recursive fonksiyon kullanarak faktoriyel hesabı yapınız

        Student can = new Student();
        can.setName("Can");
        can.display();
        System.out.println(can.getName());

    }
}