package lab6;

public class Lab6Zad2 {
    public static void main(String[] args) {
        //utworzenie dwóch obiektów klasy String
        String s1 = "Mateusz";
        String s2 = "Boczarski";

        //porównanie obiektów klasy String za pomocą metody equals i wydrukowanie
        boolean w1 = s1.equals(s2);
        System.out.println(w1);

        //porównanie obiektów klasy String za pomocą metody equalsIgnoreCase i wydrukowanie
        boolean w2 = s1.equalsIgnoreCase(s2);
        System.out.println(w2);

        //porównanie obiektów klasy String za pomocą metody compareTo i wydrukowanie
        int w3 = s1.compareTo(s2);
        System.out.println(w3);

        //porównanie obiektów klasy String za pomocą metody compareToIgnoreCase i wydrukowanie
        int w4 = s1.compareToIgnoreCase(s2);
        System.out.println(w4);
    }
}