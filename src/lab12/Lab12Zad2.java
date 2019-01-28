package lab12;

import java.io.*;
import java.util.Scanner;

public class Lab12Zad2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObywatelB o1 = new ObywatelB("Kowalski", "Adam", "97011903567", 3000);
        ObywatelB o2 = new ObywatelB();
        o2.podajDane();
        System.out.println();

        ObywatelB o3 = new ObywatelB();
        ObywatelB o4 = new ObywatelB();

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("obywatelser2.dat"));
        o1.writeExternal(out);
        o2.writeExternal(out);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("obywatelser2.dat"));
        o3.readExternal(in);
        o4.readExternal(in);
        in.close();

        System.out.println("Obywatel 1");
        o3.drukujDane();
        System.out.println();

        System.out.println("Obywatel 2");
        o4.drukujDane();
    }
}

class ObywatelB implements Externalizable {
    String nazwisko;
    String imie;
    String pesel;
    double dochod;

    ObywatelB() {
    }

    ObywatelB(String nazwisko, String imie, String pesel, double dochod) {
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

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        nazwisko = (String) in.readObject();
        imie = (String) in.readObject();
        pesel = (String) in.readObject();
        dochod = (double) in.readObject();
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(nazwisko);
        out.writeObject(imie);
        out.writeObject(pesel);
        out.writeObject(dochod);
    }
}