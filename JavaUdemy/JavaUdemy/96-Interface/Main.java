interface Alan {
    void AlaniHesapla(int kisakenar, int uzunkenar);
}

class Ev implements Alan {
    public void AlaniHesapla(int kisakenar, int uzunkenar) {
        System.out.println("Odamizin alani: " + (uzunkenar * kisakenar));
    }

}

public class Main {
    public static void main(String[] args) {
        Ev oda1 = new Ev();
        oda1.AlaniHesapla(4, 8);
    }
}