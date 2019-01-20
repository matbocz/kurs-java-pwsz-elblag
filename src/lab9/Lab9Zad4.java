package lab9;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Lab9Zad4 {
    public static void main(String[] args) {
        int dl, typ;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Podaj długość: ");
        while (!sc.hasNextInt()) {
            System.out.println("To nie jest liczba całkowita!");
            System.out.println("Podaj długość: ");
            sc.next();
        }
        dl = sc.nextInt();

        typ = r.nextInt(100);
        System.out.println("Wylosowana liczba to: " + typ);
        System.out.println();

        FiguraD l = new LiniaD(dl);
        FiguraD k = new KwadratD(dl);
        if (typ % 2 == 0) {
            test(l);
        } else {
            test(k);
        }
    }

    static void test(FiguraD f) {
        FiguraD testLinia = new LiniaD(1);

        if (f.getClass() == testLinia.getClass()) {
            f.rysuj();
        } else {
            f.rysuj();
        }
    }
}

abstract class FiguraD {
    int dlugosc;

    FiguraD(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    void rysuj() {
    }
}

class LiniaD extends FiguraD {
    LiniaD(int dlugosc) {
        super(dlugosc);
    }

    void rysuj() {
        System.out.println("Linia o długości: " + dlugosc);
        for (int i = 0; i < dlugosc; i++) {
            System.out.printf("-");
        }
        System.out.printf("\n");
    }
}

class KwadratD extends FiguraD {
    KwadratD(int dlugosc) {
        super(dlugosc);
    }

    void rysuj() {
        System.out.println("Kwadrat o boku długości: " + dlugosc);
        for (int i = 0; i < dlugosc; i++) {
            for (int j = 0; j < dlugosc; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        System.out.println("Pole kwadratu: " + pow(dlugosc, 2));
    }
}