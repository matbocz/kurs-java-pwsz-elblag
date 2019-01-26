package lab10;

interface Obliczenia {
    double poleTrojkata();

    double poleKwadratu();

    double poleProstokata();

    double poleTrapezu();
}

public class Lab10Zad1 {
    public static void main(String[] args) {
        Trojkat trojkat = new Trojkat();
        Kwadrat kwadrat = new Kwadrat();
        Prostokat prostokat = new Prostokat();
        Trapez trapez = new Trapez();

        System.out.println("Pole trójkąta: " + trojkat.poleTrojkata(2, 4));
        System.out.println("Pole kwadratu: " + kwadrat.poleKwadratu(5));
        System.out.println("Pole prostokąta: " + prostokat.poleProstokata(2, 6));
        System.out.println("Pole trapezu: " + trapez.poleTrapezu(5, 5, 2));
    }
}

abstract class Adapt implements Obliczenia {
    public double poleTrojkata() {
        return 0;
    }

    public double poleKwadratu() {
        return 0;
    }

    public double poleProstokata() {
        return 0;
    }

    public double poleTrapezu() {
        return 0;
    }
}

class Trojkat extends Adapt {
    Trojkat() {
    }

    double poleTrojkata(double a, double h) {
        return (a * h) / 2;
    }
}

class Kwadrat extends Adapt {
    Kwadrat() {
    }

    double poleKwadratu(double a) {
        return a * a;
    }
}

class Prostokat extends Adapt {
    Prostokat() {
    }

    double poleProstokata(double a, double b) {
        return a * b;
    }
}

class Trapez extends Adapt {
    Trapez() {
    }

    double poleTrapezu(double a, double b, double h) {
        return ((a + b) * h) / 2;
    }
}