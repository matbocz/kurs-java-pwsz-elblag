package lab9;

interface Speakable {
    int QUIET = 0;
    int LOUD = 1;

    String getVoice(int voice);
}

interface Moveable {
    void start();

    void stop();
}

public class Lab9Zad5 {
    public static void main(String[] args) {
        Dog kuba = new Dog("Kuba");
        kuba.start();
        System.out.println(kuba.getVoice(Speakable.LOUD));
        kuba.stop();
        System.out.println(kuba.getVoice());

        System.out.println();

        Cat kruczek = new Cat("Kruczek");
        kruczek.start();
        System.out.println(kruczek.getVoice(Speakable.LOUD));
        kruczek.stop();
        System.out.println(kruczek.getVoice());

        System.out.println();

        Animal z;
        z = kuba;
        z.start();
        z = kruczek;
        z.start();
    }
}

abstract class Animal implements Speakable, Moveable {
    String name;

    Animal() {
    }

    Animal(String s) {
        name = s;
    }

    abstract String getTyp();

    abstract String getName();

    public abstract String getVoice();

    public abstract void start();

    public abstract void stop();
}

class Dog extends Animal {
    Dog() {
    }

    Dog(String s) {
        super(s);
    }

    String getTyp() {
        return "Dog";
    }

    String getName() {
        return name;
    }

    public String getVoice() {
        return "Implementacja metody abstrakcyjnej.";
    }

    public String getVoice(int voice) {
        if (voice == LOUD) return "HAU..HAU..HAU";
        else return "hau.hau.hau";
    }

    public void start() {
        System.out.println("Dog " + name + " is running.");
    }

    public void stop() {
        System.out.println("Dog " + name + " stopped.");
    }
}

class Cat extends Animal {
    Cat() {
    }

    Cat(String s) {
        super(s);
    }

    String getTyp() {
        return "Cat";
    }

    String getName() {
        return name;
    }

    public String getVoice() {
        return "Implementacja metody abstrakcyjnej.";
    }

    public String getVoice(int voice) {
        if (voice == LOUD) return "MIAU..MIAU..MIAU";
        else return "miau..miau..miau";
    }

    public void start() {
        System.out.println("Cat " + name + " is running.");
    }

    public void stop() {
        System.out.println("Cat " + name + " stopped.");
    }
}