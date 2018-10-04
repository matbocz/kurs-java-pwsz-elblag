package lab1; //deklaracja pakietu

import java.io.IOException; //import klasy
import java.util.Scanner; //import klasy

public class Fourth { //definicja klasy publicznej
    public static void main(String[] args) throws IOException { //definicja metody, obsługa wyjątków

        //deklaracja zmiennych
        double a, b;
        double wynik1, wynik2, wynik3, wynik4, wynik5;

        //wczytanie zmiennej z klawiatury
        System.out.println("Podaj liczbę a: "); //wypisanie tekstu
        Scanner sc1 = new Scanner(System.in); //utworzenie obiektu typu scanner
        while (!sc1.hasNextDouble()) { //sprawdzanie czy w strumieniu jest ciąg znaków typu double
            System.out.println("To nie jest liczba zmiennoprzecinkowa."); //wypisanie tekstu
            System.out.println("Podaj liczbę a: "); //wypisanie tekstu
            sc1.next(); //wczytanie łańcucha znaków z klawiatury
        }
        a = sc1.nextDouble(); //przypisanie do zmienne liczby wczytanej z klawiatury

        //wczytanie zmiennej z klawiatury
        System.out.println("Podaj liczbę b: "); //wypisanie tekstu
        Scanner sc2 = new Scanner(System.in); //utworzenie obiektu typu scanner
        while (!sc2.hasNextDouble()) { //sprawdzanie czy w strumieniu jest ciąg znaków typu double
            System.out.println("To nie jest liczba zmiennoprzecinkowa."); //wypisanie tekstu
            System.out.println("Podaj liczbę b: "); //wypisanie tekstu
            sc2.next(); //wczytanie łańcucha znaków z klawiatury
        }
        b = sc2.nextDouble(); //przypisanie do zmienne liczby wczytanej z klawiatury

        //wykonanie obliczeń oraz podstawienie wyników do zmiennych
        wynik1 = a + b;
        wynik2 = a - b;
        wynik3 = a * b;
        wynik4 = a / b;
        wynik5 = a % b;

        //wypisanie wyników
        System.out.printf("\n%f + %f = %f \n", a, b, wynik1);
        System.out.printf("%f - %f = %f \n", a, b, wynik2);
        System.out.printf("%f * %f = %f \n", a, b, wynik3);
        System.out.printf("%f / %f = %f \n", a, b, wynik4);
        System.out.printf("%f mod %f = %f \n", a, b, wynik5);
    }
}