
abstract class Animal {
    abstract void makeSound();

    public void eat() {
        System.out.println("Her hayvan yemek yer");
    }

}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Kopek havlar");
    }

}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Kedi mivaylar");
    }

}

public class Main {
    public static void main(String[] args) {
        Dog alex = new Dog();
        Cat c = new Cat();
        alex.makeSound();
        alex.eat();

        c.makeSound();
        c.eat();

    }
}