
class Oda {
    private int kisaKenar;
    private int uzunKenar;

    Oda(int kisaKenar, int uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    public void alanHesabi() {
        int alan = this.kisaKenar * this.uzunKenar;
        System.out.println("Odamin alani " + alan);
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

}

public class Main {
    public static void main(String[] args) {
        Oda benimOdam = new Oda(4, 8);
        benimOdam.setKisaKenar(4);
        benimOdam.alanHesabi();
    }
}