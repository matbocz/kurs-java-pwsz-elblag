package lab9;

import java.util.Random;
import java.util.Scanner;

public class Lab9Zad3 {
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

        if (typ % 2 == 0) {
            FiguraC f = new LiniaC(dl);
            f.rysuj();
            System.out.println(f.getClass());
        } else {
            FiguraC f = new KwadratC(dl);
            f.rysuj();
            System.out.println(f.getClass());
        }
    }
}

abstract class FiguraC {
    int dlugosc;

    FiguraC(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    void rysuj() {
    }
}

class LiniaC extends FiguraC {
    LiniaC(int dlugosc) {
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

class KwadratC extends FiguraC {
    KwadratC(int dlugosc) {
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
    }
}