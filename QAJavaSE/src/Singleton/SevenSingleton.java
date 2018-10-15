package Singleton;

import java.util.ArrayList;

public class SevenSingleton {

    private static SevenSingleton[] singleList = new SevenSingleton[7];

    public static void main(String[] args) {
        getInstance();
    }

    public SevenSingleton(){ }


    public static SevenSingleton getInstance(){

        for (int i = 0; i < singleList.length; i++) {
            if(singleList[i] != null){
                return singleList[i];
            }
        }
        SevenSingleton ss = new SevenSingleton();
        return singleList[0] = ss;
    }


    public static SevenSingleton getInstance(int index){
        if (index > 6) return null;
        if(singleList[index] != null){
            return singleList[index];
        }else {
        	SevenSingleton ss = new SevenSingleton();
            return singleList[index] = ss;
        }
    }

    public static SevenSingleton createInstance(){
        for (int i = 0; i < singleList.length; i++) {
            if(singleList[i] == null){
            	SevenSingleton ss = new SevenSingleton();
                return singleList[i] =ss;
            }
        }
        return getInstance();
    }

}