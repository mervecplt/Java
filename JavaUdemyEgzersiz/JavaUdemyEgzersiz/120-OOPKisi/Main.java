import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String country;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getCountry() {
        return this.country;
    }

}

public class Main {
    // Kisiye ait bilgileri OOP kullanarak setter ve getter fonksiyonlarla
    // bastırınız

    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Can Boz");
        person.setAge(33);
        person.setCountry("Turkey");

        System.out.println("Ad: " + person.getName());
        System.out.println("Yas: " + person.getAge());
        System.out.println("Ulke: " + person.getCountry());

    }

}