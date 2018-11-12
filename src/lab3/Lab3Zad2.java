package lab3; //deklaracja pakietu

import java.util.Scanner; //import klasy

public class Lab3Zad2 { //definicja klasy publicznej
    public static void main(String[] args) { //definicja metody main
        //deklaracja tablic jednowymiarowych typu int
        int x[] = new int[5];
        int wyniki[] = new int[2];

        //wczytanie tablicy jednowymiarowej  x typu int
        readTab1D(x);

        //wydrukowanie min i max tablicy jednowymiarowej x typu int
        System.out.println("Min i Max to: ");
        wyniki = maxMin(x);
        printTab1D(wyniki);
    }

    //metoda wczytująca tablicę jednowymiarową typu int
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

    //metoda drukująca tablicę jednowymiarową typu int
    static void printTab1D(int tab[]) {
        for (int i = 0; i < tab.length; i++)
            System.out.println(tab[i]);
    }

    //metoda zwracająca min i max tablicy jednowymiarowej typu int
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