package lab3;

import java.util.Scanner;

public class lab3Zad1 {
    public static void main(String[] args) {

        double x[] = new double[5];
        double y[] = new double[5];
        double z[] = new double[5];

        readTab1D(x);
        printTab1D(x);

        lab3Zad1.readTab1D(y);
        lab3Zad1.printTab1D(y);

        lab3Zad1 c = new lab3Zad1();
        c.readTab1D(z);
        c.printTab1D(z);
    }

    static void readTab1D(double tab[]) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj element tablicy: ");
            while (!sc.hasNextDouble()) {
                System.out.println("To nie jest liczba zmienoprzecinkowa.");
                System.out.println("Podaj liczbę zmiennoprzecinkową:");
                sc.next();
            }
            tab[i] = sc.nextDouble();
        }
    }

    static void printTab1D(double tab[]) {

        for (int i = 0; i < tab.length; i++)
            System.out.println(tab[i]);
    }
}