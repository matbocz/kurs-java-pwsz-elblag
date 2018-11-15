package lab4;

import java.math.BigInteger;

public class Lab4Zad4 {
    public static void main(String[] args) {
        //utworzenie obiektu typu BigInteger za pomocą konstruktora
        BigInteger a = new BigInteger("2345768907654222");
        //utworzenie obiektu typu BigInteger za pomocą metody valueOf
        BigInteger b = BigInteger.valueOf(3000);

        //wydrukowanie liczb typu BigInteger
        System.out.println("Liczba a: " + a);
        System.out.println("Liczba b: " + b);
        System.out.println();

        //wykonanie obliczeń na liczbach typu BigInteger
        BigInteger suma = a.add(b);
        BigInteger roznica = a.subtract(b);
        BigInteger iloczyn = a.multiply(b);
        BigInteger iloraz = a.divide(b);
        BigInteger reszta = a.mod(b);

        //wydrukowanie wyników obliczeń na liczbach typu BigInteger
        System.out.println("Suma a + b: " + suma);
        System.out.println("Różnica a - b: " + roznica);
        System.out.println("Iloczyn a * b: " + iloczyn);
        System.out.println("Iloraz a / b: " + iloraz);
        System.out.println("Reszta a % b: " + reszta);
    }
}