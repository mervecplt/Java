class Animal {
    String name = "Alex";

    public void eat() {
        System.out.println("Hayvanlar yemek yer");
    }

}

class Dog extends Animal {

    public void friendly() {
        System.out.println("Kopekler insan sever");
    }

    public void displayName() {
        System.out.println("Kopegimizin adi: " + this.name);
    }

}

public class Main {
    public static void main(String[] args) {

        Dog alex = new Dog();

        alex.eat();
        alex.friendly();
        alex.displayName();

    }
}