
class Person {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
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
        Person p = new Person();
        p.setAge(33);
        p.setName("Osman");
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}