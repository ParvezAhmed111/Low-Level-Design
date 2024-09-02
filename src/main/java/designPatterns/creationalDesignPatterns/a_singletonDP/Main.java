package designPatterns.creationalDesignPatterns.a_singletonDP;

public class Main {
    public static void main(String[] args) {
        SingletonLazy singletonLazy1= SingletonLazy.getSingleton();
        SingletonLazy singletonLazy2= SingletonLazy.getSingleton();
        System.out.println(singletonLazy1.hashCode());
        System.out.println(singletonLazy2.hashCode());

        SingletonEarly singletonEarly1= SingletonEarly.getSingleton();
        SingletonEarly singletonEarly2= SingletonEarly.getSingleton();
        System.out.println(singletonEarly1.hashCode());
        System.out.println(singletonEarly2.hashCode());
    }
}
