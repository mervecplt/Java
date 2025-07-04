
enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Kebap {
    Size kebapSize;

    Kebap(Size kebapSize) {
        this.kebapSize = kebapSize;
    }

    public void kebapType() {
        switch (kebapSize) {
            case SMALL:
                System.out.println("Kucuk bir kebap");
                break;
            case MEDIUM:
                System.out.println("Orta boy bir kebap");
                break;
            case LARGE:
                System.out.println("Buyuk bir kebap");
                break;
            case EXTRALARGE:
                System.out.println("Kocaman bir kebap");
                break;
            default:
                System.out.println("Hangi boy oldugunu bilmiyorum!");
                break;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Kebap adana = new Kebap(Size.EXTRALARGE);
        adana.kebapType();
    }
}