package lab_3; //deklaracja pakietu

import java.util.Scanner; //import klasy

public class lab3Zad1 { //definicja klasy publicznej
    public static void main(String[] args) { //definicja metody main
        //deklaracja tablic jednowymiarowych typu double
        double x[] = new double[5];
        double y[] = new double[5];
        double z[] = new double[5];

        //wczytanie i wydrukowanie tablicy jednowymiarowej x typu double
        readTab1D(x);
        printTab1D(x);

        //wczytanie i wydrukowanie tablicy jednowymiarowej y typu double
        lab3Zad1.readTab1D(y);
        lab3Zad1.printTab1D(y);

        //wczytanie i wydrukowanie tablicy jednowymiarowej z typu double
        lab3Zad1 c = new lab3Zad1();
        c.readTab1D(z);
        c.printTab1D(z);
    }

    //metoda wczytująca tablicę jednowymiarową typu double
    static void readTab1D(double tab[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj element tablicy: ");
            while (!sc.hasNextDouble()) {
                System.out.println("To nie jest liczba zmiennoprzecinkowa.");
                System.out.println("Podaj liczbę zmiennoprzecinkową:");
                sc.next();
            }
            tab[i] = sc.nextDouble();
        }
    }

    //metoda drukująca tablicę jednowymiarową typu double
    static void printTab1D(double tab[]) {
        for (int i = 0; i < tab.length; i++)
            System.out.println(tab[i]);
    }
}