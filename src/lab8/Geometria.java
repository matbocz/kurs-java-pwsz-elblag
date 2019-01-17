package lab8;

public class Geometria {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 5);

        p1.przesun(2, 3);
        p2.przesun(5, 8);

        p1.wypisz();
        p2.wypisz();

        Box b = new Box(3, 5, 2);
        System.out.println("Objętośc: " + b.objetosc());
    }
}

class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void wyzeruj() {
        x = 0;
        y = 0;
    }

    void przesun(int deltaX, int deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }

    void wypisz() {
        System.out.println("Współrzędne: " + x + " " + y);
    }
}

class Box {
    int dlugosc;
    int szerokosc;
    int wysokosc;

    Box() {
        dlugosc = 0;
        szerokosc = 0;
        wysokosc = 0;
    }

    Box(int dlugosc, int szerokosc, int wysokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    int objetosc() {
        int obj;

        obj = dlugosc * szerokosc * wysokosc;

        return obj;
    }
}