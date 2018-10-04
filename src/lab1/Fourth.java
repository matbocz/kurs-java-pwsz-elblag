package lab1;

import java.io.IOException;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) throws IOException {
        double a, b;
        double wynik1, wynik2, wynik3, wynik4, wynik5;

        System.out.println("Podaj liczbę a: ");
        Scanner sc1=new Scanner(System.in);
        while(!sc1.hasNextDouble()) {
            System.out.println("To nie jest liczba zmiennoprzecinkowa.");
            System.out.println("Podaj liczbę a: ");
            sc1.next();
        }
        a=sc1.nextDouble();

        System.out.println("Podaj liczbę b: ");
        Scanner sc2=new Scanner(System.in);
        while(!sc2.hasNextDouble()) {
            System.out.println("To nie jest liczba zmiennoprzecinkowa.");
            System.out.println("Podaj liczbę b: ");
            sc2.next();
        }
        b=sc2.nextDouble();

        wynik1=a+b;
        wynik2=a-b;
        wynik3=a*b;
        wynik4=a/b;
        wynik5=a%b;

        System.out.printf("\n%f + %f = %f \n",a,b,wynik1);
        System.out.printf("%f - %f = %f \n",a,b,wynik2);
        System.out.printf("%f * %f = %f \n",a,b,wynik3);
        System.out.printf("%f / %f = %f \n",a,b,wynik4);
        System.out.printf("%f mod %f = %f \n",a,b,wynik5);
    }
}