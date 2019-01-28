package lab12;

import java.io.*;
import java.util.Scanner;

public class Lab12Zad1 {
    public static void main(String[] args) throws IOException {
        ObywatelA o1 = new ObywatelA("Kowalski", "Adam", "97011903567", 3000);
        ObywatelA o2 = new ObywatelA();
        o2.podajDane();
        System.out.println();

        ObywatelA o3 = new ObywatelA();
        ObywatelA o4 = new ObywatelA();

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("obywatelser1.dat"));

            out.writeObject(o1);
            out.writeObject(o2);

            out.close();
        } catch (EOFException exc) {
            exc.printStackTrace();
            System.exit(1);
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("obywatelser1.dat"));

            o3 = (ObywatelA) in.readObject();
            o4 = (ObywatelA) in.readObject();

            in.close();
        } catch (EOFException exc) {
            exc.printStackTrace();
            System.exit(1);
        } catch (ClassNotFoundException exc) {
            System.out.println(" Nie można znaleźć klasy obiektu");
            System.exit(1);
        }

        System.out.println("Obywatel 1");
        o3.drukujDane();
        System.out.println();

        System.out.println("Obywatel 2");
        o4.drukujDane();
    }
}

class ObywatelA implements Serializable {
    String nazwisko;
    String imie;
    String pesel;
    double dochod;

    ObywatelA() {
    }

    ObywatelA(String nazwisko, String imie, String pesel, double dochod) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.pesel = pesel;
        this.dochod = dochod;
    }

    void podajDane() {
        System.out.println("Podaj nazwisko: ");
        Scanner sc1 = new Scanner(System.in);
        nazwisko = sc1.nextLine();

        System.out.println("Podaj imię: ");
        Scanner sc2 = new Scanner(System.in);
        imie = sc2.nextLine();

        System.out.println("Podaj PESEL: ");
        Scanner sc3 = new Scanner(System.in);
        pesel = sc3.nextLine();

        System.out.println("Podaj dochód: ");
        Scanner sc4 = new Scanner(System.in);
        dochod = sc4.nextDouble();
    }

    void drukujDane() {
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Imie: " + imie);
        System.out.println("PESEL: " + pesel);
        System.out.println("Dochod: " + dochod);
    }
}