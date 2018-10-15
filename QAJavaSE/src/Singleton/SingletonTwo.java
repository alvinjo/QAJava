package Singleton;

public class SingletonTwo {

    private static SingletonTwo instance = null;

    private SingletonTwo(){}

    //MUST be STATIC. If this method only belongs to an instantiation of an object and that object cannot be created
    // than this doesnt work
    public static SingletonTwo getInstance(){
        if(instance == null){
            instance = new SingletonTwo();
            return instance;
        }else{
            return instance;
        }
    }

    public void print(){
        System.out.println("shingle");
    }

}