package lab9;

public class Lab9Zad1 {
    public static void main(String[] args) {
        FiguraA[] f = new FiguraA[2];

        for (int i = 0; i < f.length; i++) {
            f[i] = new LiniaA();
            f[i].rysuj();
        }

        for (int i = 0; i < f.length; i++) {
            f[i] = new KwadratA();
            f[i].rysuj();
        }
    }
}

class FiguraA {
    int dlugosc;

    FiguraA() {
        dlugosc = 0;
    }

    FiguraA(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    void rysuj() {
    }
}

class LiniaA extends FiguraA {
    void rysuj() {
        System.out.println("Linia");
    }
}

class KwadratA extends FiguraA {
    void rysuj() {
        System.out.println("Kwadrat");
    }
}