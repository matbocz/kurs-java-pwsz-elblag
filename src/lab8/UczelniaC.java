package lab8;

import java.util.Scanner;

public class UczelniaC {
    public static void main(String[] args) {
        double ocena1, ocena2;
        String nazwisko;
        StudentC[] s = new StudentC[3];

        for (int i = 0; i < s.length; i++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Podaj nazwisko: ");
            while (!sc1.hasNextLine()) {
                System.out.println("To nie jest łańcuch.");
                System.out.println("Podaj nazwisko: ");
                sc1.next();
            }
            nazwisko = sc1.nextLine();

            Scanner sc2 = new Scanner(System.in);
            System.out.println("Podaj ocena1: ");
            while (!sc2.hasNextDouble()) {
                System.out.println("To nie jest liczba zmiennoprzecinkowa.");
                System.out.println("Podaj ocena1: ");
                sc2.next();
            }
            ocena1 = sc2.nextDouble();

            Scanner sc3 = new Scanner(System.in);
            System.out.println("Podaj ocena2: ");
            while (!sc3.hasNextDouble()) {
                System.out.println("To nie jest liczba zmiennoprzecinkowa.");
                System.out.println("Podaj ocena2: ");
                sc3.next();
            }
            ocena2 = sc3.nextDouble();

            s[i] = new StudentC(nazwisko, ocena1, ocena2);
            s[i].wypisz();
        }
    }
}

class StudentC {
    String nazwisko;
    double ocena1;
    double ocena2;

    StudentC() {
        nazwisko = "";
        ocena1 = 0;
        ocena2 = 0;
    }

    StudentC(String nazwisko, double ocena1, double ocena2) {
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