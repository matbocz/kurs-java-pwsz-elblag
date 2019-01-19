package lab8;

public class UczelniaA {
    public static void main(String[] args) {
        StudentA s = new StudentA("Boczarski", 3, 4);

        s.wypisz();
    }
}

class StudentA {
    String nazwisko;
    double ocena1;
    double ocena2;

    StudentA() {
        nazwisko = "";
        ocena1 = 0;
        ocena2 = 0;
    }

    StudentA(String nazwisko, double ocena1, double ocena2) {
        this.nazwisko = nazwisko;
        this.ocena1 = ocena1;
        this.ocena2 = ocena2;
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