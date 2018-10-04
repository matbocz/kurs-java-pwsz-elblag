package lab1; //deklaracja pakietu

public class Third { //definicja klasy publicznej
    public static void main(String[] args) { //metoda main
	
		//deklaracja zmiennych
        double a=8.6, b=3.1;
        double wynik1, wynik2, wynik3, wynik4, wynik5;

		//wykonanie obliczeń oraz podstawienie wyniku do zmiennej
        wynik1=a+b;
        wynik2=a-b;
        wynik3=a*b;
        wynik4=a/b;
        wynik5=a%b;

		//wypisanie tekstu oraz zmiennych
        System.out.printf("%f + %f = %f \n",a,b,wynik1);
        System.out.printf("%f - %f = %f \n",a,b,wynik2);
        System.out.printf("%f * %f = %f \n",a,b,wynik3);
        System.out.printf("%f / %f = %f \n",a,b,wynik4);
        System.out.printf("%f mod %f = %f \n",a,b,wynik5);
    }
}