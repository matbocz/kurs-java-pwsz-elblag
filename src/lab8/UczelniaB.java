package lab8;

public class UczelniaB {
    public static void main(String[] args) {
        StudentB s = new StudentB();

        s.wstawOcene(7, 4);

        s.wypisz();
    }
}

class StudentB {
    String nazwisko;
    private double ocena1;
    private double ocena2;

    StudentB() {
        nazwisko = "Boczarski";
        ocena1 = 0;
        ocena2 = 0;
    }

    void wstawOcene(double o1, double o2) {
        if (o1 < 1 || o1 > 6)
            System.out.println("Nieprawidłowa ocena.");
        else
            ocena1 = o1;

        if (o2 < 1 || o2 > 6)
            System.out.println("Nieprawidłowa ocena.");
        else
            ocena2 = o2;
    }

    double srednia() {
        double sr;

        sr = (ocena1 + ocena2) / 2;

        return sr;
    }

    void wypisz() {
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Ocena1: " + ocena1);
        System.out.println("Ocena2: " + ocena2);
        System.out.println("Średnia: " + srednia());
    }
}