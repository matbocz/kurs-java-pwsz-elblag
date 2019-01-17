package lab2; //deklaracja pakietu

import java.io.IOException;
import java.util.Scanner;

public class Lab2Zad1 { //definicja klasy publicznej
    public static void main(String[] args) throws IOException { //definicja metody, obsługa wyjątków

        //deklaracja zmiennych
        double x, wynik;
        double licznik, licz1, licz2, licz3, licz4;
        double mianownik, mian1, mian2, mian3, mian4;

        //wczytanie zmiennej z klawiatury z zabezpieczeniem formatu
        do {
            System.out.println("Podaj liczbę x: ");
            Scanner sc = new Scanner(System.in);
            while (!sc.hasNextDouble()) {
                System.out.println("To nie jest liczba zmiennoprzecinkowa.");
                System.out.println("Podaj liczbę x: ");
                sc.next();
            }
            x = sc.nextDouble();
            if (x <= 1) System.out.println("x<=1");
        } while (x <= 1);

        //wykonanie obliczeń oraz podstawienie wyników do zmiennych
        licz1 = Math.log10(x) / Math.log10(2);
        licz2 = Math.cbrt(1 / Math.tan(x));
        licz3 = Math.ceil(Math.pow(3, x));
        licz4 = Math.exp(Math.pow(x, 3));

        //obliczenie licznika oraz jego wydrukowanie
        licznik = licz1 + licz2 + licz3 + licz4;
        System.out.println("Licznik: " + licznik);

        //wykonanie obliczeń oraz podstawienie wyników do zmiennych
        mian1 = Math.tan(x);
        mian2 = Math.log(Math.abs(Math.sin(x)));
        mian3 = Math.pow(Math.PI, x);

        //obliczenie mianownika oraz jego wydrukowanie
        mianownik = mian1 + mian2 + mian3;
        System.out.println("Mianownik: " + mianownik);

        //obliczenie wyniku oraz jego wydrukowanie
        wynik = licznik / mianownik;
        System.out.println("Wynik: " + wynik);
    }
}