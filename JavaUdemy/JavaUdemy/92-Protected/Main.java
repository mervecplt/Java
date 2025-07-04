class Animal {
    protected String name;

    public void eat() {
        System.out.println("Hayvanlar yemek yer");
    }

}

class Dog extends Animal {

    public void eat() {
        super.eat();
        System.out.println("Kopek yemegi yer");
    }

    public void displayName() {
        System.out.println("Kopegimizin adi: " + this.name);
    }

}

public class Main {
    public static void main(String[] args) {

        Dog alex = new Dog();

        alex.name = "Alex";
        alex.displayName();

    }
}