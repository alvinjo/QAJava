package Singleton;

public class SingletonMain {


    public static void main(String[] args) {
        Singleton ss = Singleton.getInstance();
        ss.print();


        SingletonTwo sb = SingletonTwo.getInstance();
        sb.print();
        SingletonTwo sc = SingletonTwo.getInstance();
        sc.print();

    }

}
