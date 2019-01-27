package lab11;

public class Lab11Zad1 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        try {
            tab[10] = 200;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nieprawidłowy indeks tablicy!");
        }

        try {
            int liczba = 20 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Wyjątek arytmetyczny!");
            System.out.println("Komunikat systemowy: " + e.getMessage());
        }
    }
}

class GeneralException extends Exception {
    public static void main(String[] args) throws GeneralException {
        throw new GeneralException();
    }
}