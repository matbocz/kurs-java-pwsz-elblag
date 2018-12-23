package lab6;

public class Lab6Zad4 {
    public static void main(String[] args) {
        //utworzenie obiektu klasy String
        String s1 = new String("Nazwa");

        //zamienienie liter w łańcuchu na małe i wydrukowanie
        String s2 = s1.toLowerCase();
        System.out.println(s2);
        System.out.println();

        //zamienienie liter w łańcuchu na duże i wydrukowanie
        String s3 = s1.toUpperCase();
        System.out.println(s3);
    }
}