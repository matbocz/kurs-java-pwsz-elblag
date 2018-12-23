package lab6;

public class Lab6Zad3 {
    public static void main(String[] args) {
        //utworzenie dwóch obiektów klasy String
        String s1 = new String("AbcdFghIkl");
        String s2 = new String("cdF");

        //wyszukanie w łańcuchu, bez pozycji początkowej
        int w1 = s1.indexOf(s2);
        System.out.println(w1);

        //wyszukanie w łańcuchu, z pozycją początkową
        int w2 = s1.indexOf(s2, 3);
        System.out.println(w2);
    }
}