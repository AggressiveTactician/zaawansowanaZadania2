package zad1;

public class Kalkulator {
    private int liczba1;
    private int liczba2;
    private Dzialania typ;

    public int obliczenia() {
        switch (typ) {
            case DODAWANIE:
                return liczba1 + liczba2;
            case ODEJMOWANIE:
                return liczba1 - liczba2;
            case MNOŻENIE:
                return liczba1 * liczba2;
            case DZIELENIE:
                return liczba1 / liczba2;
            default:
                return 0;
        }
    }

    public int getLiczba1() {
        return liczba1;
    }

    public void setLiczba1(int liczba1) {
        this.liczba1 = liczba1;
    }

    public int getLiczba2() {
        return liczba2;
    }

    public void setLiczba2(int liczba2) {
        this.liczba2 = liczba2;
    }

    public Dzialania getTyp() {
        return typ;
    }

    public void setTyp(Dzialania typ) {
        this.typ = typ;
    }
}