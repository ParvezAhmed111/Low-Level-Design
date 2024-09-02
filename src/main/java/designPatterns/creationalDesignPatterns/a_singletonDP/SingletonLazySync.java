package designPatterns.creationalDesignPatterns.a_singletonDP;

public class SingletonLazySync {
    private static SingletonLazySync singleton;

    // constructor
    private SingletonLazySync(){

    }

    //lazy way of creating singleton object
    public static SingletonLazySync getSingleton(){
        //object of this class
        if(singleton==null){
            synchronized (SingletonLazySync.class){
                // only one thread will be able to access it, if T1 is accessing it, T2 will wait
                singleton = new SingletonLazySync();
            }
        }
        return singleton;
    }
}
