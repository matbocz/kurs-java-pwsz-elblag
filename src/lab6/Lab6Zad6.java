package lab6;

public class Lab6Zad6 {
    public static void main(String[] args) {
        //utworzenie obiektu klasy String
        String str = "zielony,niebieski,czerwony";

        //podzielenie łańcucha na części i wydrukowanie
        String results[] = str.split(",");
        for (String x : results)
            System.out.println(x);
    }
}