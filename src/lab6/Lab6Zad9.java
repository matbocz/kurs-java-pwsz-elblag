package lab6;

public class Lab6Zad9 {
    public static void main(String[] args) {
        //utworzenie obiektu klasy StringBuilder
        StringBuilder str = new StringBuilder("ABC");

        //dodanie do łańcucha nowej części i wydrukowanie
        str.append("123CDE");
        System.out.println(str);
        System.out.println();

        //zamienienie znaku w łańcuchu i wydrukowanie
        str.setCharAt(0, 'a');
        System.out.println(str);
        System.out.println();

        //dodanie nowej części na początek łańcucha i wydrukowanie
        str.insert(0, "000");
        System.out.println(str);
        System.out.println();

        //usunięcie części z końca łańcucha i wydrukowanie
        str.delete(9, 12);
        System.out.println(str);
    }
}