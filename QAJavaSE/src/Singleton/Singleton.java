package Singleton;

public class Singleton {

    private static Singleton single = new Singleton();

    //To ensure that additional instantiations are not made, the constructor is made private.
    //The constructor cannot be called if private and so a new singleton object cannot be created.
    private Singleton(){}


    public static Singleton getInstance(){
        return single;
    }

    public static void print(){
        System.out.println("asd");
    }

}
