package lab6;

import java.util.Date;

public class Lab6Zad1 {
    public static void main(String[] args) {
        //utworzenie dwóch obiektów klasy String
        String s1 = "Mateusz ";
        String s2 = "Boczarski";

        //połączenie dwóch obiektów klasy String i wydrukowanie
        String s3 = s1 + s2;
        System.out.println(s3);
        System.out.println();

        //utworzenie obiektu klasy Date
        Date data = new Date();

        //utworzenie obiektu klasy String i wydrukowanie
        String s4 = "Dzisiaj jest: " + data;
        System.out.println(s4);
    }
}