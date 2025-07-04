
class Car {
    private String company;
    private String model;
    private int year;

    Car(String comp, String mdl, int yr) {
        this.company = comp;
        this.model = mdl;
        this.year = yr;

    }

    public String getCompany() {
        return this.company;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void setCompany(String comp) {
        this.company = comp;
    }

    public void setModel(String mdl) {
        this.model = mdl;
    }

    public void setYear(int yr) {
        this.year = yr;
    }

}

public class Main {
    // Arabaya ait bilgileri OOP kullanarak setter ve getter fonksiyonlarla
    // bastırınız
    public static void main(String[] args) {

        Car car = new Car("AUDI", "A6", 2013);

        System.out.println("Marka: " + car.getCompany());
        System.out.println("Model: " + car.getModel());
        System.out.println("Yil: " + car.getYear());

        car.setCompany("BMW");
        car.setModel("X1");
        car.setYear(2015);

        System.out.println("Yeni arabamiz");
        System.out.println("Marka: " + car.getCompany());
        System.out.println("Model: " + car.getModel());
        System.out.println("Yil: " + car.getYear());

    }

}