package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.showMessage("Singleton 1");
        singleton2.showMessage("Singleton 2");

        System.out.println(singleton2 == singleton1);
    }
}
