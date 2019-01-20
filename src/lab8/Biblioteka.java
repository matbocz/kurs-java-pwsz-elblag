package lab8;

public class Biblioteka {
    public static void main(String[] args) {
        Book[] b = {
                new Book("Tolkien", "Hobbit"),
                new Book("King", "Zielona mila"),
                new Book("King", "Sklepik z marzeniami"),
                new Book("Tolkien", "Władca pierścieni"),
                new Book("Glukhovsky", "Metro 2033"),
                new Book("Glukhovsky", "FUTU.RE"),
                new Book("Saramago", "Miasto ślepców"),
                new Book("Orwell", "Rok 1984")
        };

        Czytelnik[] cz = {
                new Czytelnik("Boczarski"),
                new Czytelnik("Baran"),
                new Czytelnik("Mąka"),
                new Czytelnik("Mysz"),
                new Czytelnik("Kowal")
        };

        System.out.println("--Książki--");
        for (int i = 0; i < b.length; i++) {
            System.out.println("Tytuł: " + b[i].tytul + ", Autor: " + b[i].autor);
        }
        System.out.println();

        System.out.println("--Czytelnicy--");
        for (int i = 0; i < cz.length; i++) {
            System.out.println("Nazwisko: " + cz[i].nazwisko);
        }
        System.out.println();

        cz[0].wypozycz(b[0]);
        System.out.println("Czy książka jest wypożyczona? " + b[0].wypozyczona);
        cz[0].wypozycz(b[1]);
        System.out.println("Czy książka jest wypożyczona? " + b[1].wypozyczona);
        System.out.println();

        cz[0].wypozycz(b[2]);
        System.out.println("Czy książka jest wypożyczona? " + b[2].wypozyczona);
        System.out.println();

        cz[0].zwroc(b[1]);
        cz[0].wypozycz(b[2]);
        System.out.println("Czy książka jest wypożyczona? " + b[2].wypozyczona);
    }
}

class Book {
    String autor;
    String tytul;
    boolean wypozyczona;

    Book(String autor, String tytul) {
        this.autor = autor;
        this.tytul = tytul;
    }
}

class Czytelnik {
    String nazwisko;
    Book book1;
    Book book2;

    Czytelnik(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    void wypozycz(Book ksiazka) {
        if (ksiazka.wypozyczona == false) {
            if (book1 == null) {
                book1 = ksiazka;
                ksiazka.wypozyczona = true;
            } else if (book2 == null) {
                book2 = ksiazka;
                ksiazka.wypozyczona = true;
            } else
                System.out.println("Można wypożyczyć tylko dwie książki!");
        } else
            System.out.println("Ta książka jest już wypożyczona!");
    }

    void zwroc(Book ksiazka) {
        if (ksiazka.wypozyczona == true) {
            if (book1 == ksiazka) {
                book1 = null;
                ksiazka.wypozyczona = false;
            } else if (book2 == ksiazka) {
                book2 = null;
                ksiazka.wypozyczona = false;
            } else
                System.out.println("Nie wypożyczono tej książki!");
        } else
            System.out.println("Ta książka nie została jeszcze wypożyczona!");
    }
}