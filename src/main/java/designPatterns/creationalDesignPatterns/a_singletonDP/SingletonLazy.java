package designPatterns.creationalDesignPatterns.a_singletonDP;

public class SingletonLazy {
    private static SingletonLazy singleton;

    // constructor
    private SingletonLazy(){

    }

    //lazy way of creating singleton object
    public static SingletonLazy getSingleton(){
        //object of this class
        if(singleton==null){
            singleton = new SingletonLazy();
        }
        return singleton;
    }

}
