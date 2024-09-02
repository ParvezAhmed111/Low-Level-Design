package designPatterns.creationalDesignPatterns.a_singletonDP;

public class SingletonEarly {
    //early way of creating singleton object
    private static SingletonEarly singleton = new SingletonEarly();

    // constructor
    private SingletonEarly(){

    }

    public static SingletonEarly getSingleton(){
        return singleton;
    }

}
