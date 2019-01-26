package lab10;

public class Lab10Zad5 {
    public static void main(String[] args) {
        Uczen uczen = new Uczen("Kowalski", 3, 5);
        Student student = new Student("Nowak", 3, 5, 2);

        System.out.println("Uczeń");
        uczen.wypisz();
        System.out.println();

        System.out.println("Student");
        student.wypisz();
    }
}

class Uczen {
    protected String nazwisko;
    protected double ocena1;
    protected double ocena2;

    public Uczen() {
    }

    public Uczen(String nazwisko, double ocena1, double ocena2) {
        this.nazwisko = nazwisko;
        this.ocena1 = ocena1;
        this.ocena2 = ocena2;
    }

    public double srednia() {
        return (ocena1 + ocena2) / 2;
    }

    public void wypisz() {
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Średnia: " + srednia());
    }
}

class Student extends Uczen {
    private double waga;

    public Student(String nazwisko, double ocena1, double ocena2, double waga) {
        super(nazwisko, ocena1, ocena2);
        this.waga = waga;
    }

    public double srednia() {
        return ((ocena1 * waga) + (ocena2 * waga)) / (2 * waga);
    }
}