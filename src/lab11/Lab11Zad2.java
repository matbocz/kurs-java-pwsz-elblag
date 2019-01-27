package lab11;

public class Lab11Zad2 {
    public static void main(String[] args) {
        Uczen u1 = new Uczen();

        try {
            u1.wstawOceny(2, 8);
        } catch (WyjatekOcena e) {
            System.out.println("Błąd oceny: " + WyjatekOcena.blednaOcena);
        }

        System.out.println("Oceny to: " + u1.ocena1 + ", " + u1.ocena2);
    }
}

class WyjatekOcena extends Exception {
    static double blednaOcena;

    WyjatekOcena() {
    }

    WyjatekOcena(double blednaOcena) {
        WyjatekOcena.blednaOcena = blednaOcena;
    }
}

class Uczen {
    protected double ocena1;
    protected double ocena2;

    public Uczen() {
    }

    public Uczen(double ocena1, double ocena2) {
        this.ocena1 = ocena1;
        this.ocena2 = ocena2;
    }

    public void wstawOceny(double ocena1, double ocena2) throws WyjatekOcena {
        if (ocena1 < 1 || ocena1 > 6)
            throw new WyjatekOcena(ocena1);
        else
            this.ocena1 = ocena1;

        if (ocena2 < 1 || ocena2 > 6)
            throw new WyjatekOcena(ocena2);
        else
            this.ocena2 = ocena2;
    }
}