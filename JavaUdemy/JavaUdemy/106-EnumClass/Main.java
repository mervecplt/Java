
enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE;

    public String kebapType() {
        switch (this) {
            case SMALL:
                return "Kucuk bir kebap";

            case MEDIUM:
                return "Orta boy bir kebap";
            case LARGE:
                return "Buyuk bir kebap";

            case EXTRALARGE:
                return "Kocaman bir kebap";
            default:
                return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Kebabin boyu: " + Size.EXTRALARGE.kebapType());
    }
}