package lab4;

import java.math.BigDecimal;

public class Lab4Zad7 {
    public static void main(String[] args) {
        //utworzenie obiektów typu BigDecimal za pomocą konstruktora
        BigDecimal a = new BigDecimal("1000000000000.000");
        BigDecimal b = new BigDecimal("3200.000");

        //wydrukowanie liczb typu BigDecimal
        System.out.println("Liczba a: " + a);
        System.out.println("Liczba b: " + b);
        System.out.println();

        //wykonanie obliczeń na liczbach typu BigDecimal
        BigDecimal suma = a.add(b);
        BigDecimal roznica = a.subtract(b);
        BigDecimal iloczyn = a.multiply(b);
        BigDecimal iloraz = a.divide(b);

        //wydrukowanie wyników obliczeń na liczbach typu BigDecimal
        System.out.println("Suma a + b: " + suma);
        System.out.println("Różnica a - b: " + roznica);
        System.out.println("Iloczyn a * b: " + iloczyn);
        System.out.println("Iloraz a / b: " + iloraz);
    }
}