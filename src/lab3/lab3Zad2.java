package lab3;

import java.util.Scanner;

public class lab3Zad2 {
    public static void main(String[] args) {

        int x[] = new int[5];
        int wyn[] = new int[2];

        readTab1D(x);

        System.out.println("Min i Max to: ");
        wyn = maxMin(x);
        printTab1D(wyn);
    }

    static void readTab1D(int tab[]) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj element tablicy: ");
            while (!sc.hasNextInt()) {
                System.out.println("To nie jest liczba całkowita.");
                System.out.println("Podaj liczbę całkowitą: ");
                sc.next();
            }
            tab[i] = sc.nextInt();
        }
    }

    static void printTab1D(int tab[]) {

        for (int i = 0; i < tab.length; i++)
            System.out.println(tab[i]);
    }

    static int[] maxMin(int tab[]) {

        int max, min;
        int wyn[] = new int[2];

        max = min = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) min = tab[i];
            if (tab[i] > max) max = tab[i];
        }

        wyn[0] = min;
        wyn[1] = max;

        return wyn;
    }
}