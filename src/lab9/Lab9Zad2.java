package lab9;

import java.util.Scanner;

public class Lab9Zad2 {
    public static void main(String[] args) {
        int dl, typ;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("0 jeśli linia, 1 jeśli kwadrat: ");
            while (!sc.hasNextInt()) {
                System.out.println("To nie jest liczba całkowita!");
                System.out.println("0 jeśli linia, 1 jeśli kwadrat: ");
                sc.next();
            }
            typ = sc.nextInt();
        } while (typ != 0 && typ != 1);

        System.out.println("Podaj długość: ");
        while (!sc.hasNextInt()) {
            System.out.println("To nie jest liczba całkowita!");
            System.out.println("Podaj długość: ");
            sc.next();
        }
        dl = sc.nextInt();

        if (typ == 0) {
            FiguraB f = new LiniaB(dl);
            f.rysuj();
        } else {
            FiguraB f = new KwadratB(dl);
            f.rysuj();
        }
    }
}

abstract class FiguraB {
    int dlugosc;

    FiguraB(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    void rysuj() {
    }
}

class LiniaB extends FiguraB {
    LiniaB(int dlugosc) {
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

class KwadratB extends FiguraB {
    KwadratB(int dlugosc) {
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