package lab10;

public class Lab10Zad4 {
    public static void main(String[] args) {
        Szescian szescian = new Szescian(4);

        szescian.wymiary();
        System.out.println();
        szescian.objetosc();
    }
}

class Pudelko {
    protected int dlugosc;
    protected int szerokosc;
    protected int wysokosc;

    public Pudelko() {
    }

    public Pudelko(int dlugosc, int szerokosc, int wysokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    public void objetosc() {
        System.out.println("Objętość: " + dlugosc * szerokosc * wysokosc);
    }

    public void wymiary() {
        System.out.println("Długość: " + dlugosc);
        System.out.println("Szerokość: " + szerokosc);
        System.out.println("Wysokość: " + wysokosc);
    }
}

class Szescian extends Pudelko {
    Szescian(int x) {
        dlugosc = x;
        szerokosc = x;
        wysokosc = x;
    }
}