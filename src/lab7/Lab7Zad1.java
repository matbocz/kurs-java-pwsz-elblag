package lab7;

public class Lab7Zad1 {
    public static void main(String[] args) {
        Regal r = new Regal();
        r.dodajPolke(new Polka(20));

        Polka p = new Polka(20);
        p.dodajKsiazke(new Ksiazka(1111));

        r.dodajPolke(p);

        System.out.println(r.ilePolek);
        System.out.println(p.ileKsiazek);
    }

    static class Regal {
        int ilePolek;
        Polka[] polki;

        Regal() {
            ilePolek = 0;
            polki = new Polka[5];
        }

        public void dodajPolke(Polka polka) {
            polki[ilePolek] = polka;
            ilePolek++;
        }
    }

    static class Polka {
        int ileKsiazek;
        Ksiazka[] ksiazki;

        public Polka(int ile) {
            ileKsiazek = ile;
            ksiazki = new Ksiazka[50];
        }

        public void dodajKsiazke(Ksiazka ksiazka) {
            ksiazki[ileKsiazek] = ksiazka;
            ileKsiazek++;
        }
    }

    static class Ksiazka {
        int ileKsiazek;

        public Ksiazka(int ile) {
            this.ileKsiazek = ile;
        }
    }
}