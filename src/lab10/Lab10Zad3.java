package lab10;

public class Lab10Zad3 {
    public static void main(String[] args) {
        Wolumin[] woluminy = {
                new Ksiazka("Pan Tadeusz", "Adam Mickiewicz"),
                new Ksiazka("Katedra", "Jacek Dukaj"),
                new Czasopismo("Komputery", 23),
                new Czasopismo("Przepisy", 44)
        };
    }
}

abstract class Wolumin {
    protected int id;
    private int x = 1;

    Wolumin() {
        id = x;
        x += 1;
    }
}

class Ksiazka extends Wolumin {
    String tytul;
    String autor;

    Ksiazka(String tytul, String autor) {
        this.tytul = tytul;
        this.autor = autor;
    }
}

class Czasopismo extends Wolumin {
    String tytul;
    int numerWydania;

    Czasopismo(String tytul, int numerWydania) {
        this.tytul = tytul;
        this.numerWydania = numerWydania;
    }
}